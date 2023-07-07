/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package Controller;

import java.util.*;
import com.mycompany.cineshow.Cliente;
import persistencia.ClienteDao;

/**
 *
 * @author dayane
 */

public class ControlaCliente implements Controla<Cliente> {
    private ArrayList<Cliente> clientes;
    private ClienteDao clienteDao;

    public ControlaCliente() {
        this.clientes = new ArrayList<>();
        this.clienteDao = new ClienteDao();
        atualizaObjetos();
    }

    public ClienteDao getClienteDao(){
        return this.clienteDao;
    }

    @Override
    public boolean salvar(Cliente cliente){
        boolean sucesso = this.clienteDao.salvar(cliente); 
        if (sucesso) {
            this.clientes.add(cliente);
            return true;
        } 
        else {
            return false;
        }
    }

    @Override
    public ArrayList<Cliente> retornarTodos(){
        return this.clientes;
    }
    

    @Override
    public void atualizaObjetos() {
        this.clientes = this.clienteDao.ler();
    }

    @Override
    public Cliente retornaPorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public boolean salvaObjetoComIndice(Cliente objeto, int indice) {
        if (objeto != null) {
            this.clientes.add(indice, objeto);
            this.clientes.remove(indice + 1);
            return true;
        } 
        else 
            return false; 
    }


}

