package com.mycompany.cineshow;

import java.util.*;

public class Sala {

  private int numero;
  private int capacidade;
  private String tipoTela;
  private List<Assento> assentos;

  public Sala(int numero, int capacidade, String tipoTela) {
    this.numero = numero;
    this.capacidade = capacidade;
    this.tipoTela = tipoTela;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public String getTipoTela() {
    return tipoTela;
  }

  public void setTipoTela(String tipoTela) {
    this.tipoTela = tipoTela;
  }

  @Override
  public String toString() {
    return (
      "Sala{" +
      "numero=" +
      numero +
      ", capacidade=" +
      capacidade +
      ", tipoTela='" +
      tipoTela +
      '\'' +
      '}'
    );
  }
}
