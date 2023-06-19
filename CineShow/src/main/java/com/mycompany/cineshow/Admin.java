package com.mycompany.cineshow;

public class Admin extends Pessoa {

  private String username;
  private String password;

  public Admin(
    String nome,
    String endereco,
    String email,
    String telefone,
    String username,
    String password
  ) {
    super(nome, endereco, email, telefone);
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
