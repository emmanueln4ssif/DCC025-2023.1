/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cineshow.telas.cadastramentoFuncionario;

import java.util.*;
import com.mycompany.cineshow.Funcionario;
import persistencia.FuncionarioDao;
import persistencia.SessaoDao;

/**
 *
 * @author dayane
 */
public class ControlaFuncionario {
    private ArrayList<Funcionario> funcionarios;
    private FuncionarioDao funcionarioDao;

    public ControlaFuncionario() {
        this.funcionarios = new ArrayList<>();
        this.funcionarioDao = new FuncionarioDao();
        atualizaFuncionarios();
    }

    public FuncionarioDao getFuncionarioDao(){
        return this.funcionarioDao;
    }

    public boolean salvar(Funcionario funcionario){
        boolean sucesso = this.funcionarioDao.salvar(funcionario); 
        if (sucesso) {
            this.funcionarios.add(funcionario);
            return true;
        } 
        else {
            return false;
        }
    }

    public void atualizaFuncionarios(){
        this.funcionarios = this.funcionarioDao.ler();

    }


    public ArrayList<Funcionario> retornarTodos(){
        return this.funcionarios;
    }

    public Funcionario retornaFuncPorNome(String nome){
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                return funcionario;
            }
        }
        return null;
    }

    public boolean salvaFilmeComIndice(Funcionario funcionario, int indice){
        if (funcionario != null) {
            this.funcionarios.add(indice, funcionario);
            this.funcionarios.remove(indice + 1);
            return true;
        } 
        else 
            return false;
    }


}
