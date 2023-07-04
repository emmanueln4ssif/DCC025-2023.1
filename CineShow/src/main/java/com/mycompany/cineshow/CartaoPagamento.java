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
    
    public String getDataValidade(){
        return this.dataValidade;
    }
    
    public int getCodigoSeguranca(){
        return this.codigoSeguranca;
    }
    
    

    public void validarCartao() {
        Scanner teclado = new Scanner(System.in);
        if(validarNumeroCartao(this.numeroCartao) && this.codigoSeguranca < 999){
            try {
                Data.parser(this.dataValidade);
               
            } catch(DataException err){
                System.out.println(err.getMessage());
                this.dataValidade = teclado.nextLine();
                validarCartao();
            } 
        }else{
            System.out.println("Numero de cartao invalida, informa um numero de Cartao valido");
            this.numeroCartao = teclado.nextLine();
            validarCartao();
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


