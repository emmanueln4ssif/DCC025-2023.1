package com.mycompany.cineshow;
public class Cinema {
    private String nome;
    private String endereco;
    private int capacidadeAssentos;

    public Cinema(String nome, String endereco, int capacidadeAssentos) {
        this.nome = nome;
        this.endereco = endereco;
        this.capacidadeAssentos = capacidadeAssentos;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getCapacidadeAssentos() {
        return capacidadeAssentos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCapacidadeAssentos(int capacidadeAssentos) {
        this.capacidadeAssentos = capacidadeAssentos;
    }

    public int calculaPreco(Filme filme, Assento assento){
        return 0;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", capacidadeAssentos=" + capacidadeAssentos +
                '}';
    }
}