/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
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
