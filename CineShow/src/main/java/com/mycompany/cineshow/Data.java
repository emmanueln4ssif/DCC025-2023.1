package com.mycompany.cineshow;

import java.util.*;
import com.mycompany.cineshow.exceptions.DataException;

public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
    
    public static Data parser(String data) throws DataException {
        String[] splitedDate = data.split("/");
        
        Data toReturn;
        
        if(splitedDate.length != 3)
            throw new DataException();
        
        int dia = Integer.parseInt(splitedDate[0]);
        int mes = Integer.parseInt(splitedDate[1]);
        int ano = Integer.parseInt(splitedDate[2]);
        
        if(dia < 1 || dia > 30 || mes < 1 || mes > 12 || ano < 2023 || ano > 9999)
            throw new DataException();
            
        toReturn = new Data(dia, mes, ano);
        // System.out.println(toReturn.getAno());
        return toReturn;
    }
    
    public int diferenca( Data data ){
        int thisDateInDays = getAno()*12*30 + (getMes()*30) + getDia();
        int passedDateInDays = data.getAno()*12*30 + (data.getMes()*30) + data.getDia();
        return thisDateInDays-passedDateInDays;
    }
}














