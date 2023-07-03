package com.mycompany.cineshow;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.mycompany.cineshow.exceptions.DataException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CartaoPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private int codigoSeguranca;

    public CartaoPagamento(String numeroCartao, String nomeTitular, String dataValidade, int codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }
    
    public String getNumeroCartao(){
        return this.numeroCartao;
    }
    
    public String getNomeTitular(){
        return this.nomeTitular;
    }
    
    
    public void recuperarDadosCartao(String nomeArquivo){
        File arquivo = new File(nomeArquivo);

        try (Scanner scanner = new Scanner(arquivo)) {
            System.out.println("Dados do cartao lido ***************");
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
            System.out.println("Fim dos dados lidos*****************");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + arquivo.getName());
        }
    }

    public void salvarCartaoEmArquivo(String nomeArquivo) {
        Scanner teclado = new Scanner(System.in);
        if(validarNumeroCartao(this.numeroCartao) && this.codigoSeguranca < 999){
            try (FileWriter writer = new FileWriter(nomeArquivo)) {
                Data.parser(this.dataValidade);
                writer.write("Número do cartão: " + numeroCartao + "\n");
                writer.write("Nome do titular: " + nomeTitular + "\n");
                writer.write("Data de validade: " + dataValidade + "\n");
                writer.write("Código de segurança: " + codigoSeguranca + "\n");
    
                System.out.println("Cartão salvo com sucesso no arquivo: " + nomeArquivo);
            } catch(DataException err){
                System.out.println(err.getMessage());
                this.dataValidade = teclado.nextLine();
                salvarCartaoEmArquivo(nomeArquivo);
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao salvar o cartão no arquivo: " + nomeArquivo);
                e.printStackTrace();
            } 
        }else{
            System.out.println("Numero de cartao invalida, informa um numero de Cartao valido");
            this.numeroCartao = teclado.nextLine();
            salvarCartaoEmArquivo(nomeArquivo);
        }
    }
    
    public static boolean validarNumeroCartao(String numeroCartao) {
        // Remover espaços em branco e caracteres não numéricos
        String numeroLimpo = numeroCartao.replaceAll("\\s+", "");

        // Verificar se o número do cartão está vazio ou possui caracteres não numéricos
        if (!numeroLimpo.matches("\\d+")) {
            return false;
        }

        // Converter o número do cartão em um array de dígitos
        int[] digitos = new int[numeroLimpo.length()];
        for (int i = 0; i < numeroLimpo.length(); i++) {
            digitos[i] = Integer.parseInt(String.valueOf(numeroLimpo.charAt(i)));
        }

        // Aplicar o algoritmo de Luhn
        for (int i = digitos.length - 2; i >= 0; i -= 2) {
            int digito = digitos[i];
            digito *= 2;
            if (digito > 9) {
                digito -= 9;
            }
            digitos[i] = digito;
        }

        int soma = 0;
        for (int digito : digitos) {
            soma += digito;
        }

        // O número do cartão é válido se a soma for múltipla de 10
        return soma % 10 == 0;
    }

}

