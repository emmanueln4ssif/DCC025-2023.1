package com.mycompany.cineshow.exceptions;


public class DataException extends Exception {
    
    public DataException(){
        super("Insere uma data de validade valida no formato DD/MM/AAAA por favor");
    }
    
}