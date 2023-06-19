package com.mycompany.cineshow;

public class Funcionario extends Pessoa {

  private double salario;
  private String cargo;

  public Funcionario(
    String nome,
    String endereco,
    String email,
    String telefone,
    double salario,
    String cargo
  ) {
    super(nome, endereco, email, telefone);
    this.salario = salario;
    this.cargo = cargo;
  }

}
