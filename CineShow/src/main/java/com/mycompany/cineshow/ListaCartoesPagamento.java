/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package com.mycompany.cineshow;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCartoesPagamento {
    private static final String NOME_ARQUIVO = "cartoes.txt";

    public static void carregarCartoes(List<CartaoPagamento> listaCartoes) {
        File arquivo = new File(NOME_ARQUIVO);

        try (Scanner scanner = new Scanner(arquivo)) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] dadosCartao = linha.split(";");

                if (dadosCartao.length == 4) {
                    String numeroCartao = dadosCartao[0];
                    String nomeTitular = dadosCartao[1];
                    String dataValidade = dadosCartao[2];
                    String codigoSeguranca = dadosCartao[3];

                    CartaoPagamento cartao = new CartaoPagamento(numeroCartao, nomeTitular, dataValidade, Integer.parseInt(codigoSeguranca));
                    listaCartoes.add(cartao);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + arquivo.getName());
        }
    }

    public static void salvarCartoes(List<CartaoPagamento> listaCartoes) {
        try (FileWriter writer = new FileWriter(NOME_ARQUIVO)) {
            for (CartaoPagamento cartao : listaCartoes) {
                writer.write(cartao.getNumeroCartao() + ";" +
                             cartao.getNomeTitular() + ";" +
                             cartao.getDataValidade() + ";" +
                             cartao.getCodigoSeguranca() + "\n");
            }

            System.out.println("Cartões salvos com sucesso no arquivo: " + NOME_ARQUIVO);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os cartões no arquivo: " + NOME_ARQUIVO);
            e.printStackTrace();
        }
    }
    
    public static int indiceDumCartao(List<CartaoPagamento> listaCartoes, CartaoPagamento cartaoAProcurar){
        for (CartaoPagamento cartao : listaCartoes) {
            if(cartao.getNumeroCartao().equals(cartaoAProcurar.getNumeroCartao())){
                return listaCartoes.indexOf(cartao);
            }
        }
        return -1;
    }
    
    public static void deletarCartao(List<CartaoPagamento> listaCartoes, CartaoPagamento cartaoADeletar) {
        int index = indiceDumCartao(listaCartoes, cartaoADeletar);
        if (index != -1) {
            listaCartoes.remove(index);
            System.out.println("Cartão deletado com sucesso");
        } else {
            System.out.println("Erro ao deletar: Cartão nao encontrado");
        }
        salvarCartoes(listaCartoes);
    }
    
    public static void editarCartao(List<CartaoPagamento> listaCartoes, CartaoPagamento cartaoAEditar, CartaoPagamento cartaoASalvar) {
        int index = indiceDumCartao(listaCartoes, cartaoAEditar);
        if(index != -1){
            listaCartoes.set(index, cartaoASalvar);
            System.out.println("Cartao editado com sucesso");
        }else
            System.out.println("Erro ao editar: Cartão nao encontrado");
        salvarCartoes(listaCartoes);
    }
    
    public static void exibirCartoes(List<CartaoPagamento> listaCartoes) {
        System.out.println("Lista de Cartões de Pagamento:");
        for (CartaoPagamento cartao : listaCartoes) {
            System.out.println("Número: " + cartao.getNumeroCartao());
            System.out.println("Titular: " + cartao.getNomeTitular());
            System.out.println("Validade: " + cartao.getDataValidade());
            System.out.println("Código de Segurança: " + cartao.getCodigoSeguranca());
            System.out.println();
        }
    }
}
