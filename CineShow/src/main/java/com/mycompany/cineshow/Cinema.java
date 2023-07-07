/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package com.mycompany.cineshow;

import java.util.*;

public class Cinema {

  private String nome;
  private String endereco;
  private int capacidadeAssentos;
  private Admin admin;
  private List<Funcionario> funcionarios;
  private List<Filme> filmes;
  private List<Cliente> clientes;
  private List<Sessao> sessoes;

  public Cinema(
    String nome,
    String endereco,
    int capacidadeAssentos,
    Admin admin,
    List<Funcionario> funcionarios,
    List<Filme> filmes,
    List<Cliente> clientes,
    List<Sessao> sessoes
  ) {
    this.nome = nome;
    this.endereco = endereco;
    this.capacidadeAssentos = capacidadeAssentos;
    this.admin = admin;
    this.funcionarios = funcionarios;
    this.filmes = filmes;
    this.clientes = clientes;
    this.sessoes = sessoes;
  }

  public Admin getAdmin() {
    return admin;
  }

  public void setAdmin(Admin admin) {
    this.admin = admin;
  }

  public List<Funcionario> getFuncionarios() {
    return funcionarios;
  }

  public void setFuncionarios(List<Funcionario> funcionarios) {
    this.funcionarios = funcionarios;
  }

  public List<Filme> getFilmes() {
    return filmes;
  }

  public void setFilmes(List<Filme> filmes) {
    this.filmes = filmes;
  }

  public List<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(List<Cliente> clientes) {
    this.clientes = clientes;
  }

  public List<Sessao> getSessoes() {
    return sessoes;
  }

  public void setSessoes(List<Sessao> sessoes) {
    this.sessoes = sessoes;
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

  @Override
  public String toString() {
    return (
      "Cinema{" +
      "nome='" +
      nome +
      '\'' +
      ", endereco='" +
      endereco +
      '\'' +
      ", capacidadeAssentos=" +
      capacidadeAssentos +
      '}'
    );
  }
}
