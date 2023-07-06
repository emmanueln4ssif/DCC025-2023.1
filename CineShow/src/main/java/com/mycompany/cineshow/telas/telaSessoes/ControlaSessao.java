
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

    public SessaoDao getSessaoDao(){
        return this.sessaoDao;
    }
    
    public boolean salvar(Sessao sessao){
        boolean sucesso = this.sessaoDao.salvar(sessao); 
        if (sucesso) {
            this.sessoes.add(sessao);
            return true;
        } 
        else {
            return false;
        }
    }
    
    public void atualizaSessoes(){
        this.sessoes = this.sessaoDao.ler();
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
    
    public boolean salvaSessaoComIndice(Sessao sessao, int indice){
        if (sessao != null) {
            this.sessoes.add(indice, sessao);
            this.sessoes.remove(indice + 1);
            return true;
        } 
        else 
            return false;    
    }
}

    

