package com.mycompany.cineshow;

import java.util.*;

public class PagamentoCartao extends Pagamento {

  private CartaoPagamento cartao; 

  public PagamentoCartao(double valor, CartaoPagamento cartao) {
    super(valor);
    this.cartao = cartao;
  }

    public static CartaoPagamento SalvarNovoCartao(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número do cartão: ");
        String numeroCartao = scanner.nextLine();

        System.out.println("Informe o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.println("Informe a data de validade no formato DD/MM/AAAA: ");
        String dataValidade = scanner.nextLine();

        System.out.println("Informe o código de segurança: ");
        String codigoSeguranca = scanner.nextLine();

        CartaoPagamento cartao = new CartaoPagamento(numeroCartao, nomeTitular, dataValidade, Integer.parseInt(codigoSeguranca));
        cartao.validarCartao();
        scanner.close();
        return cartao;
    }
    

    @Override
    public boolean efetuarPagamento() {
        System.out.println("Pagamento feito com sucesso, Aqui estao as info do seu Pagamento");
        System.out.println("Nome do Cliente: " + cartao.getNomeTitular());
        System.out.println("Numero do cartao: " + cartao.getNumeroCartao());
        System.out.println("Valor Pago: " + getValor());
        return true;
    }
}
