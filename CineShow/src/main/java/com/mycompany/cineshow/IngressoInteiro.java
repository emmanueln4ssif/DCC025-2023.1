package com.mycompany.cineshow;

public class IngressoInteiro extends Ingresso {

  public IngressoInteiro(Filme filme, double preco) {
    super(filme, preco);
    this.setTipo("Inteiro");
  }

  public double calculaPreco() {
    return getPreco();
  }
}
