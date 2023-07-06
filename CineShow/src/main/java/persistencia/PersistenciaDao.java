package persistencia;


import java.util.ArrayList;

public abstract class PersistenciaDao<T> {
    public abstract ArrayList<T> ler();
    public abstract boolean salvar(T elemento);
    public abstract void apagaArquivo();
}
