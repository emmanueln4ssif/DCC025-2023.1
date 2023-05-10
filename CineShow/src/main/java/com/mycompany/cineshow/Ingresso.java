
package com.mycompany.cineshow;
public abstract class Ingresso {
    private Filme filme;
    private Assento assento;
    private double preco;
    private String tipo;
    
    public Ingresso(Filme filme, Assento assento, double preco) {
        this.filme = filme;
        this.assento = assento;
        this.preco = preco;
    }

    public Filme getFilme() {
        return filme;
    }

    public Assento getAssento() {
        return assento;
    }

    public double getPreco() {
        return preco;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
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
                ", assento=" + assento +
                ", preco=" + preco +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
