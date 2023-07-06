package persistencia;

import com.mycompany.cineshow.Filme;

import java.io.File;
import java.util.ArrayList;
public class FilmeDao extends PersistenciaDao<Filme>{

    @Override
    public ArrayList<Filme> ler() {
        ArrayList<Filme> filmes = new ArrayList<>();
        Arquivo arq = new Arquivo("filme.txt");

        if (arq.abrirLeitura()) {
            while (true) {
                String titulo = arq.lerLinha();
                if (titulo == null) {
                    break; // Encerra o loop quando não há mais títulos para ler
                }

                String genero = arq.lerLinha();
                String duracao = arq.lerLinha();
                String sinopse = arq.lerLinha();
                int classificacao = Integer.parseInt(arq.lerLinha());

                Filme filme = new Filme(titulo, sinopse, classificacao, genero, duracao);
                filmes.add(filme);
            }
            arq.fecharArquivo();
        }
        return filmes;
} 

    @Override
    public boolean salvar(Filme filme) {
        Arquivo arq = new Arquivo("filme.txt");

        if (arq.abrirEscrita()) {
            arq.escreverLinha(filme.getTitulo() + "");
            arq.escreverLinha(filme.getGenero() + "");
            arq.escreverLinha(filme.getDuracao() + "");
            arq.escreverLinha(filme.getSinopse() + "");
            arq.escreverLinha(Integer.toString(filme.getClassificacaoIndicativa()) + "");
            arq.fecharArquivo();
            return true;
        }
        return false;
    }

    public void apagaArquivo(){
        File file = new File("filme.txt");
        if (file.exists()) {
            file.delete();
        }    
    }

}
