package com.mycompany.cineshow;
import java.time.LocalDateTime;

public class Sessao {
    private Filme filme;
    private LocalDateTime horario;
    private int duracao;
    private Sala sala;

    public Sessao(Filme filme, LocalDateTime horario, int duracao, Sala sala) {
        this.filme = filme;
        this.horario = horario;
        this.duracao = duracao;
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}