/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package com.mycompany.cineshow.exceptions;


public class DataException extends Exception {
    
    public DataException(){
        super("Insira uma data de validade válida no formato DD/MM/AAAA, por favor");
    }
    
}