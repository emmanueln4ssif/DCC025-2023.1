/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package Controller;

import java.util.ArrayList;

/**
 *
 * @author solan
 * @param <T>
 */
public interface Controla <T>{
    
    boolean salvar(T objeto);
    void atualizaObjetos();
    ArrayList<T> retornarTodos();
    T retornaPorNome(String nome);
    boolean salvaObjetoComIndice(T objeto, int indice);
    
}
