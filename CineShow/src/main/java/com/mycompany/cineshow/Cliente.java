package com.mycompany.cineshow;

import java.util.*;

public class Cliente extends Pessoa {

    private int id;
    private String cpf;
    
    public Cliente(String nome, String endereco, String email, String telefone, String cpf) {
        super(nome, endereco, email, telefone);
        this.cpf = cpf;
    }
    
    public int getId() {
        return id;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
