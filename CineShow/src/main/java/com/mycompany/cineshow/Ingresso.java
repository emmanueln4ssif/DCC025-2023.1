
package com.mycompany.cineshow;

public abstract class Ingresso {

    private Filme filme;
    private double preco;
    private String tipo;
    private Cliente cliente;
    
    public Ingresso(Filme filme, double preco) {
        this.filme = filme;
        this.preco = preco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public double getPreco() {
        return preco;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract double calculaPreco();


    @Override
    public String toString() {
        return "Ingresso{" +
                "filme=" + filme +
                ", preco=" + preco +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
