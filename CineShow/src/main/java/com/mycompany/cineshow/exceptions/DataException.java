package com.mycompany.cineshow.exceptions;


public class DataException extends Exception {
    
    public DataException(){
        super("Insira uma data de validade válida no formato DD/MM/AAAA, por favor");
    }
    
}