package com.mycompany.cineshow;

public class PagamentoBoleto extends Pagamento {

  private String codigoBarras;

  public PagamentoBoleto(double valor, String codigoBarras) {
    super(valor);
    this.codigoBarras = codigoBarras;
  }

  @Override
  public boolean efetuarPagamento() {
    return true;
  }
}
