/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package com.mycompany.cineshow;

public class Sessao {

  private Filme filme;
  private String horario;
  private int duracao;
  private int sala;

  public Sessao(Filme filme, String horario, int duracao, int sala) {
    this.filme = filme;
    this.horario = horario;
    this.duracao = duracao;
    this.sala = sala;
  }

  public Sessao(){
    
  }

  public Filme getFilme() {
    return filme;
  }

  public void setFilme(Filme filme) {
    this.filme = filme;
  }

  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }

  public int getDuracao() {
    return duracao;
  }

  public void setDuracao(int duracao) {
    this.duracao = duracao;
  }

  public int getSala() {
    return sala;
  }

  public void setSala(int sala) {
    this.sala = sala;
  }

  @Override
  public String toString() {
    return filme + " - " + sala;

  }
}
