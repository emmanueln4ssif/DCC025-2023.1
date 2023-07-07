/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Controla;
import java.util.*;
import com.mycompany.cineshow.Filme;
import persistencia.FilmeDao;
import persistencia.SessaoDao;

/**
 *
 * @author dayane
 */
public class ControlaCadastroFilme implements Controla<Filme>{
    private ArrayList<Filme> filmes;
    private FilmeDao filmeDao;

    public ControlaCadastroFilme() {
        this.filmes = new ArrayList<>();
        this.filmeDao = new FilmeDao();
        atualizaObjetos();
    }

    public FilmeDao getFilmeDao(){
        return this.filmeDao;
    }

    @Override
    public boolean salvar(Filme filme){
        boolean sucesso = this.filmeDao.salvar(filme); 
        if (sucesso) {
            this.filmes.add(filme);
            return true;
        } 
        else {
            return false;
        }
    }
    
    @Override
    public ArrayList<Filme> retornarTodos(){
        return this.filmes;
    }
    

    @Override
    public void atualizaObjetos() {
        this.filmes = this.filmeDao.ler();
    }

    @Override
    public Filme retornaPorNome(String nome) {
        for (Filme filme : filmes) {
            if (filme.getTitulo().equals(nome)) {
                return filme;
            }
        }
        return null; 
    }

    @Override
    public boolean salvaObjetoComIndice(Filme objeto, int indice) {
        if (objeto != null) {
            this.filmes.add(indice, objeto);
            this.filmes.remove(indice + 1);
            return true;
        } 
        else 
            return false; 
    }
        
    
}
