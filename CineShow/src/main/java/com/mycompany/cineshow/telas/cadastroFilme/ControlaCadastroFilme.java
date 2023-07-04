/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cineshow.telas.cadastroFilme;

import java.util.*;
import com.mycompany.cineshow.Filme;
import persistencia.FilmeDao;

/**
 *
 * @author dayane
 */
public class ControlaCadastroFilme {
    private ArrayList<Filme> filmes;
    private FilmeDao filmeDao;

    public ControlaCadastroFilme() {
        this.filmes = new ArrayList<>();
        this.filmeDao = new FilmeDao();
        atualizaFilmes();
    }

    
    public boolean salvar(Filme filme){
        boolean sucesso = this.filmeDao.salvar(filme); 
        if (sucesso) {
            atualizaFilmes();
            return true;
        } 
        else{
            return false;
        }
    }
    
    public void atualizaFilmes(){
        this.filmes.clear(); 
        ArrayList<Filme> lista = new ArrayList<>();
        lista = this.filmeDao.ler();
        this.filmes.addAll(lista);
        
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
