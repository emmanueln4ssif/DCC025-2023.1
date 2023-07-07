/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
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

    @Override
    public String toString() {
        return getNome() + " - " + cpf;
    }
}
