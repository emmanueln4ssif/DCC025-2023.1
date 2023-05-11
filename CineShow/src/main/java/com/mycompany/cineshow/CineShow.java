package com.mycompany.cineshow;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CineShow {
    public static void main(String[] args) {
        // Criação dos objetos necessários para a venda de ingressos
        Scanner teclado = new Scanner(System.in);
        Cinema cinema = new Cinema("Cinemark", "Juiz de fora", 400);

        List<Filme> filmes = new ArrayList<>();
        Filme filme = new Filme("Matrix", "O filme se passa num futuro distopico...", 16);
        filmes.add(filme);

        List<Assento> assentos = new ArrayList<>();
        assentos.add(new Assento(1, false));
        assentos.add(new Assento(2, false));
        Cliente cliente = new Cliente("João da Silva", "Juiz de fora", "joao.silva@gmail.com", "40028922", 1,
                "123456789-0");

        // Venda de ingressos
        Venda vendas = new Venda(cliente);
        for (Assento assento : assentos) {
            double preco = cinema.calculaPreco(filme, assento);
            Ingresso ingresso = new IngressoMeiaEntrada(filme, assento, preco);
            vendas.addIngresso(ingresso);
        }

        // Pagamento
        Pagamento pagamento = new PagamentoCartao(vendas.getTotalVenda(), "1234 5678 9012 3456", "João da Silva",
                "12/24", "123");
        boolean pagamentoEfetuado = pagamento.efetuarPagamento();

        // Exibição dos resultados
        System.out.println(" ");
        System.out.println("**************Bem vindo ao CineShow!***************");
        System.out.println(" ");
        System.out.print("DESTAQUE DO DIA: ");
        System.out.println("Venda de ingressos para o filme " + filme.getTitulo());
        System.out.println("Assentos ainda disponíveis: ");
        for (Ingresso ingresso : vendas.getIngressos()) {
            System.out.println("Assento " + ingresso.getAssento().getNumero() + " da fileira "
                    + ingresso.getAssento().getNumero() + " - R$" + ingresso.calculaPreco());
        }

        System.out.println();
        System.out.println("MENU");
        System.out.println("Digite 1 para cadastrar um filme, 2 para ver os filmes cadastrados ou 3 para SAIR: ");
        int decisao = teclado.nextInt();

        while (decisao != 3) {
            switch (decisao) {
                case 1 -> {
                    teclado.nextLine();
                    System.out.println("Digite o título: ");
                    String titulo = teclado.nextLine();
                    
                    System.out.println("Digite a sinopse: ");
                    String sinopse = teclado.nextLine();
                    System.out.println("Digite a classificacao indicativa: ");
                    
                    int idade = teclado.nextInt();
                    Filme novo = new Filme(titulo, sinopse, idade);
                    filmes.add(novo);
                    System.out.println();
                    System.out.println("## FILME CADASTRADO COM SUCESSO! ##");
                    System.out.println();
                }
                case 2 -> {
                    int indice = 0; 
                    System.out.println();
                    System.out.println("## FILMES CADASTRADOS:");
                    for (Filme cadastrado : filmes) {
                        indice++;
                        System.out.println("FILME [" + indice + "] -> " + "Nome do filme: " + cadastrado.getTitulo() + "; Sinopse: "
                                + cadastrado.getSinopse() + "; Classificação indicativa: "
                                + cadastrado.getClassificacaoIndicativa() + " anos.");
                                

                    }

                }
                default -> System.out.println("COMANDO INVALIDO!");
            }

            System.out.println();
            System.out.println("Digite 1 para cadastrar um filme, 2 para ver os filmes cadastrados ou 3 para SAIR: ");
            decisao = teclado.nextInt();

        }

        System.out.println();
        System.out.println("## SESSÃO FINALIZADA ##");
    

    }
}
