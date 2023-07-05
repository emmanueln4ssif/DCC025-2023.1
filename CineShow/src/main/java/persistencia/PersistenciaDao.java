package persistencia;

import com.mycompany.cineshow.Cliente;
import com.mycompany.cineshow.Funcionario;

import java.util.ArrayList;

public abstract class PersistenciaDao<T> {
    public abstract ArrayList<T> ler();
    public  abstract boolean salvar(T elemento);

}
