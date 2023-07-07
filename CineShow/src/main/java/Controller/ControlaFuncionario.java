/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package Controller;

import Controller.Controla;
import java.util.*;
import com.mycompany.cineshow.Funcionario;
import persistencia.FuncionarioDao;

/**
 *
 * @author dayane
 */
public class ControlaFuncionario implements Controla<Funcionario> {
    private ArrayList<Funcionario> funcionarios;
    private FuncionarioDao funcionarioDao;

    public ControlaFuncionario() {
        this.funcionarios = new ArrayList<>();
        this.funcionarioDao = new FuncionarioDao();
        atualizaObjetos();
    }

    public FuncionarioDao getFuncionarioDao(){
        return this.funcionarioDao;
    }


    @Override
    public ArrayList<Funcionario> retornarTodos(){
        return this.funcionarios;
    }


    @Override
    public void atualizaObjetos() {
        this.funcionarios = this.funcionarioDao.ler();
    }

    @Override
    public Funcionario retornaPorNome(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)){
                return funcionario;
            }
        }
        return null;
    }


    @Override
    public boolean salvar(Funcionario objeto) {
        boolean sucesso = this.funcionarioDao.salvar((Funcionario)objeto); 
        if (sucesso) {
            this.funcionarios.add(objeto);
            return true;
        } 
        else {
            return false;
        }
    }

    @Override
    public boolean salvaObjetoComIndice(Funcionario objeto, int indice) {
        if (objeto != null) {
            this.funcionarios.add(indice, objeto);
            this.funcionarios.remove(indice + 1);
            return true;
        } 
        else 
            return false;
    }
}
