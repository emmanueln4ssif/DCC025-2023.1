/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package persistencia;


import java.util.ArrayList;

public abstract class PersistenciaDao<T> {
    public abstract ArrayList<T> ler();
    public abstract boolean salvar(T elemento);
    public abstract void apagaArquivo();
}
