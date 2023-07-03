package com.mycompany.cineshow;

import java.util.ArrayList;
import java.util.List;

public class Venda {

  private Ingresso ingresso;
  private Cliente cliente;

  public Venda(Cliente cliente, Ingresso ingresso) {
    this.ingresso = ingresso;
    this.cliente = cliente;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

 /**  public double getTotalVenda() {
    double total = 0;
    for (Ingresso ingresso : ingressos) {
      total += ingresso.getPreco();
    }
    return total;
  }

  @Override
  public String toString() {
    return "Vendas{" + "ingressos=" + ingressos + ", cliente=" + cliente + '}';
  }*/



public Ingresso getIngresso() {
    return ingresso;
}



public void setIngresso(Ingresso ingresso) {
    this.ingresso = ingresso;
}
}
