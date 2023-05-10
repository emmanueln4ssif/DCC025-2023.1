package com.mycompany.cineshow;
public class Filme {
    private String titulo;
    private String sinopse;
    private int classificacaoIndicativa;

    public Filme(String titulo, String sinopse, int classificacaoIndicativa) {
        this.titulo = titulo;
        this.sinopse = sinopse;
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

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", classificacaoIndicativa=" + classificacaoIndicativa +
                '}';
    }
}
