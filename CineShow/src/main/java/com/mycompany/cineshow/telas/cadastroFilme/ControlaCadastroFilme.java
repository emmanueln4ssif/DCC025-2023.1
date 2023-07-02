/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cineshow.telas.cadastroFilme;

import java.util.*;
import com.mycompany.cineshow.Filme;

/**
 *
 * @author solan
 */
public class ControlaCadastroFilme {
    private ArrayList<Filme> filmes;

    public ControlaCadastroFilme() {
        this.filmes = new ArrayList<>();
    }

    
    public boolean salvar(Filme filme){
        if(filme != null){
            this.filmes.add(filme);
            return true;
        }
        else
            return false;
    }
    
    public ArrayList<Filme> retornarTodos(){
        return this.filmes;
    }
    
    public Filme retornaFilmePorTitulo(String titulo){
    for (Filme filme : filmes) {
        if (filme.getTitulo().equals(titulo)) {
            return filme;
        }
    }
    return null; 
    }
    
    public boolean salvaFilmeComIndice(Filme filme, int indice){
        if(filme != null){
            this.filmes.add(indice, filme);
            return true;
        }
        else
            return false;    
    }
        
    
}
