package com.mycompany.cineshow;

public class IngressoInteiro extends Ingresso {

  public IngressoInteiro(Filme filme, Assento assento, double preco) {
    super(filme, assento, preco);
    this.setTipo("Inteiro");
  }

  public double calculaPreco() {
    return getPreco();
  }
}
