/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
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
