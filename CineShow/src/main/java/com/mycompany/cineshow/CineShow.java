package com.mycompany.cineshow;
import java.util.ArrayList;
import java.util.List;

public class CineShow {
    public static void main(String[] args) {
        // Criação dos objetos necessários para a venda de ingressos
        Cinema cinema = new Cinema("Cinemark", "Juiz de fora", 400);
        Filme filme = new Filme("Matrix", "Ação", 16);
        List<Assento> assentos = new ArrayList<>();
        assentos.add(new Assento(1, false));
        assentos.add(new Assento(1, true));
        assentos.add(new Assento(2, false));
        Cliente cliente = new Cliente("João da Silva","Juiz de fora", "joao.silva@gmail.com", "40028922", 1, "123456789-0");

        // Venda de ingressos
        Venda vendas = new Venda(cliente);
        for (Assento assento : assentos) {
            double preco = cinema.calculaPreco(filme, assento);
            Ingresso ingresso = new IngressoMeiaEntrada(filme, assento, preco);
            vendas.addIngresso(ingresso);
        }

        // Pagamento
        Pagamento pagamento = new PagamentoCartao(vendas.getTotalVenda(), "1234 5678 9012 3456", "João da Silva", "12/24", "123");
        boolean pagamentoEfetuado = pagamento.efetuarPagamento();

        // Exibição dos resultados
        System.out.println(" ");
        System.out.println("**************Bem vindo ao CineShow!***************");
        System.out.println(" ");
        System.out.println("Venda de ingressos para o filme " + filme.getTitulo() + ":");
        for (Ingresso ingresso : vendas.getIngressos()) {
            System.out.println("Assento " + ingresso.getAssento().getNumero() + " da fileira " + ingresso.getAssento().getNumero() + " - R$" + ingresso.calculaPreco());
        }
        System.out.println("Valor total da venda: R$" + vendas.getTotalVenda());
        if (pagamentoEfetuado) {
            System.out.println("Pagamento efetuado com sucesso.");
        } else {
            System.out.println("Erro ao efetuar o pagamento.");
        }
    }
}

