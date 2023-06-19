package com.mycompany.cineshow;

public class IngressoMeiaEntrada extends Ingresso {

  public IngressoMeiaEntrada(Filme filme, Assento assento, double preco) {
    super(filme, assento, preco);
    setTipo("Meia-entrada");
  }

  public double calculaPreco() {
    return getPreco() / 2;
  }
}
