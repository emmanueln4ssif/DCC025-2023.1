package com.mycompany.cineshow;

public class Filme {

  private String titulo;
  private String sinopse;
  private String genero;
  private String duracao;
  private int classificacaoIndicativa;

  public Filme(String titulo, String sinopse, int classificacaoIndicativa, String genero, String duracao) {
    this.titulo = titulo;
    this.sinopse = sinopse;
    this.genero = genero;
    this.duracao = duracao;
    this.classificacaoIndicativa = classificacaoIndicativa;
    
  }

  public String getTitulo() {
    return titulo;
  }

public String getSinopse() {
  return sinopse;
}

public int getClassificacaoIndicativa() {
  return classificacaoIndicativa;
}

public void setTitulo(String titulo) {
  this.titulo = titulo;
}

public void setSinopse(String sinopse) {
  this.sinopse = sinopse;
}

public void setClassificacaoIndicativa(int classificacaoIndicativa) {
  this.classificacaoIndicativa = classificacaoIndicativa;
}

public String getGenero() {
      return genero;
  }

  public void setGenero(String genero) {
      this.genero = genero;
  }

  public String getDuracao() {
      return duracao;
  }

  public void setDuracao(String duracao) {
      this.duracao = duracao;
  }
  
  

  @Override
  public String toString() {
    return titulo;
  }

public Filme toString(String lerLinha) {
    return null;
}
}
