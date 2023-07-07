package com.mycompany.cineshow;

public class IngressoMeiaEntrada extends Ingresso {

  public IngressoMeiaEntrada(Filme filme, double preco) {
    super(filme, preco);
    setTipo("Meia-entrada");
  }

  public double calculaPreco() {
    return getPreco() / 2;
  }
}
