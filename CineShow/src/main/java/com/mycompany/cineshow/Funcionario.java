package com.mycompany.cineshow;

public class Funcionario extends Pessoa {

  private double salario;
  private String cpf;

  public Funcionario(
    String nome,
    String endereco,
    String email,
    String telefone,
    double salario,
    String cpf
  ) {
    super(nome, endereco, email, telefone);
    this.salario = salario;
    this.cpf = cpf;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
