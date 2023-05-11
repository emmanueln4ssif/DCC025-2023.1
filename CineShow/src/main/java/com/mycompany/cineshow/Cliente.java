package com.mycompany.cineshow;
public class Cliente extends Pessoa {
    private int id;
    private String cpf;
    
    public Cliente(String nome, String endereco, String email, String telefone, int id, String cpf) {
        super(nome, endereco, email, telefone);
        this.id = id;
        this.cpf = cpf;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}