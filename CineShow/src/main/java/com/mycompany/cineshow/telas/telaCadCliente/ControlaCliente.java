package com.mycompany.cineshow.telas.telaCadCliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
import com.mycompany.cineshow.Cliente;
import persistencia.ClienteDao;

/**
 *
 * @author dayane
 */

public class ControlaCliente {
    private ArrayList<Cliente> clientes;
    private ClienteDao clienteDao;

    public ControlaCliente() {
        this.clientes = new ArrayList<>();
        this.clienteDao = new ClienteDao();
        atualizaClientes();
    }


    public boolean salvar(Cliente cliente){
        boolean sucesso = this.clienteDao.salvar(cliente);
        if (sucesso) {
            atualizaClientes();
            return true;
        }
        else{
            return false;
        }
    }

    public void atualizaClientes(){
        this.clientes.clear();
        ArrayList<Cliente> lista = new ArrayList<>();
        lista = this.clienteDao.ler();
        this.clientes.addAll(lista);

    }


    public ArrayList<Cliente> retornarTodos(){
        return this.clientes;
    }

    public Cliente retornaClienteCPF(String cpf){
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean salvaClienteIndice(Cliente cliente, int indice){
        if(cliente != null){
            this.clientes.add(indice, cliente);
            return true;
        }
        else
            return false;
    }


}

