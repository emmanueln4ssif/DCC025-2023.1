package com.mycompany.cineshow;

import java.util.*;

public class PagamentoCartao extends Pagamento {

  private CartaoPagamento cartao; 

  public PagamentoCartao(double valor, CartaoPagamento cartao) {
    super(valor);
    this.cartao = cartao;
  }

    public static CartaoPagamento SalvarNovoCartao(List<CartaoPagamento> listaCartoes){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do titular do cartao: ");
        String nomeTitular = scanner.nextLine();

        for (CartaoPagamento cartao : listaCartoes) {
            int veri = 0;
            int para = 0;
            if(cartao.getNomeTitular().equals(nomeTitular)){
                // System.out.println(cartao.getNomeTitular() + " " + nomeTitular);
                System.out.println("Indentificamos seu cartao, digita 1 para utilisar ele ou 0 para cadastrar outro cartao");
                veri = scanner.nextInt();
                if (veri == 1 ){ 
                    return cartao;
                }
            }
        }

        System.out.println("Informe o número do cartão: ");
        String numeroCartao = scanner.nextLine();
        for (CartaoPagamento cartao : listaCartoes) {
            if(cartao.getNumeroCartao().equals(numeroCartao)){
                int veri = 0;
                System.out.println("Indentificamos seu cartao, digita 1 para utilisar ele ou 0 para cadastrar outro cartao");
                veri = scanner.nextInt();
                if (veri == 1) 
                    return cartao;
            }
        }
        
        System.out.println("Informe a data de validade no formato DD/MM/AAAA: ");
        String dataValidade = scanner.nextLine();

        System.out.println("Informe o código de segurança: ");
        String codigoSeguranca = scanner.nextLine();

        CartaoPagamento cartao = new CartaoPagamento(numeroCartao, nomeTitular, dataValidade, Integer.parseInt(codigoSeguranca));
        //cartao.validarCartao();
        listaCartoes.add(cartao);
        ListaCartoesPagamento.salvarCartoes(listaCartoes);
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