
package com.mycompany.cineshow.telas.telaSessoes;

import Controller.Controla;
import com.mycompany.cineshow.Filme;
import com.mycompany.cineshow.Sessao;
import java.util.*;
import persistencia.SessaoDao;

/**
 *
 * @author solan
 */

public class ControlaSessao implements Controla<Sessao>{
    
    
    private ArrayList<Sessao> sessoes;
    private SessaoDao sessaoDao;

    public ControlaSessao() {
        this.sessoes = new ArrayList<>();
        this.sessaoDao = new SessaoDao();
        atualizaObjetos();
    }

    public SessaoDao getSessaoDao(){
        return this.sessaoDao;
    }
    
    @Override
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
    
    @Override
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

    @Override
    public void atualizaObjetos() {
        this.sessoes = this.sessaoDao.ler();
    }

    @Override
    public Sessao retornaPorNome(String nome) {
        for (Sessao sessao : sessoes) {
            if (sessao.getFilme().getTitulo().equals(nome)) {
                return sessao;
            }
        }
        return null;
    }

    @Override
    public boolean salvaObjetoComIndice(Sessao objeto, int indice) {
        if (objeto != null) {
            this.sessoes.add(indice, objeto);
            this.sessoes.remove(indice + 1);
            return true;
        } 
        else 
            return false;    
    }
}

    

