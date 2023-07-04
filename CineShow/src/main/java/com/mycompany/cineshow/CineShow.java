package com.mycompany.cineshow;

import com.mycompany.cineshow.telas.login.TelaLogin;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CineShow {

    private static Admin administrador = new Admin("Administrador", null, "admin@cineshow.br", null, "admin", "admin123");
    private static Funcionario funcionario = new Funcionario("Cinemildo", "Av.dasEstrelas, Centro, 100 - Jardim Los Angeles - CA", "cinemildo@funcionarios.cineshow.br", "3212345678", 13000, "123456789-10");
    private static List<Filme> filmes = new ArrayList<>();
    private static Cinema cinema = new Cinema("CineShow", "Juiz de fora", 400, administrador, null, filmes, null, null);
    // PagamentoCartao pagarComCartao = new PagamentoCartao(200, cartao);
    private static List<CartaoPagamento> listaCartoes = new ArrayList<>();
    

    public static void main(String[] args) {

        TelaLogin.desenha();

        //TESTE CARTÃO
        /*CartaoPagamento cartao = PagamentoCartao.SalvarNovoCartao();

        // Carregar os cartões do arquivo para a lista
        ListaCartoesPagamento.carregarCartoes(listaCartoes);

        // Exibir os cartões
        ListaCartoesPagamento.exibirCartoes(listaCartoes);

        // Adicionar um novo cartão à lista
        CartaoPagamento novoCartao = new CartaoPagamento("1234567812345678", "Titular 3", "12/25", 789);
        listaCartoes.add(novoCartao);
        listaCartoes.add(cartao);

        // Salvar a lista de cartões no arquivo
        ListaCartoesPagamento.salvarCartoes(listaCartoes);
        */
        //FIM DE TESTE CARTAO

        // Criação dos objetos necessários para a venda de ingressos
        Scanner teclado = new Scanner(System.in);
        
        List<Filme> filmes = new ArrayList<>();
        Filme filme = new Filme("Matrix", "O filme se passa num futuro distopico...", 16 , "Ficção científica", "2h 16m");
        filmes.add(filme);

        List<Assento> assentos = new ArrayList<>();
        assentos.add(new Assento(1, false));
        assentos.add(new Assento(2, false));
        Cliente cliente = new Cliente("João da Silva", "Juiz de fora", "joao.silva@gmail.com", "40028922","123456789-0");

       // Ingresso ingressos = new Ingresso(null, null);
            
        // Venda de ingressos
       // Venda vendas = new Venda(cliente, );
       // for (Assento assento : assentos) {
        //    double preco = cinema.calculaPreco(filme, assento);
       //     Ingresso ingresso = new IngressoMeiaEntrada(filme, assento, preco);
       //     vendas.addIngresso(ingresso);
       // }

        // Pagamento
        /**Pagamento pagamento = new PagamentoCartao(vendas.getTotalVenda(), "1234 5678 9012 3456", "João da Silva",
                "12/24", "123");
        boolean pagamentoEfetuado = pagamento.efetuarPagamento();*/

        /**  Exibição dos resultados
        System.out.println(" ");
        System.out.println("**************Bem vindo ao CineShow!***************");
        System.out.println(" ");
        System.out.print("DESTAQUE DO DIA: ");
        System.out.println("Venda de ingressos para o filme " + filme.getTitulo());
        System.out.println("Assentos ainda disponíveis: ");
        for (Ingresso ingresso : vendas.getIngressos()) {
            System.out.println("Assento " + ingresso.getAssento().getNumero() + " da fileira "
                    + ingresso.getAssento().getNumero() + " - R$" + ingresso.calculaPreco());
        }*/

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
                    
                    System.out.println("Digite o gênero: ");
                    String genero = teclado.nextLine();
                    
                    System.out.println("Digite a duração: ");
                    String duracao = teclado.nextLine();
                    
                    System.out.println("Digite a classificacao indicativa: ");
                    int idade = teclado.nextInt();
                    
                    Filme novo = new Filme(titulo, sinopse, idade, genero, duracao);
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
