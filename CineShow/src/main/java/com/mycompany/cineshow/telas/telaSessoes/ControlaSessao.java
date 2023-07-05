
package com.mycompany.cineshow.telas.telaSessoes;

import com.mycompany.cineshow.Filme;
import com.mycompany.cineshow.Sessao;
import java.util.*;
import persistencia.SessaoDao;

/**
 *
 * @author solan
 */

public class ControlaSessao {
    
    
    private ArrayList<Sessao> sessoes;
    private SessaoDao sessaoDao;

    public ControlaSessao() {
        this.sessoes = new ArrayList<>();
        this.sessaoDao = new SessaoDao();
        atualizaSessoes();
    }
    
    public boolean salvar(Sessao sessao){
        this.sessoes.add(sessao);
        boolean sucesso = this.sessaoDao.salvar(sessao); 
        if (sucesso) {
            atualizaSessoes();
            return true;
        } 
        else{
            return false;
        }
    }
    
    public void atualizaSessoes(){
        this.sessoes.clear(); 
        ArrayList<Sessao> lista = new ArrayList<>();
        lista = this.sessaoDao.ler();
        this.sessoes.addAll(lista);
    }
    
    public ArrayList<Sessao> retornarTodos(){
        return sessoes;
    }
    
    public ArrayList<Filme> retornaTodosFilmes(){
        ArrayList<Filme> listaFilmes = new ArrayList<>();
        for(Sessao sessao: sessoes){
            listaFilmes.add(sessao.getFilme());
        }
        return listaFilmes;
    }
    
    public boolean salvaSessaoComIndice(Sessao filme, int indice){
        if(filme != null){
            this.sessoes.add(indice, filme);
            return true;
        }
        else
            return false;    
    }
}

    

