package persistencia;

import com.mycompany.cineshow.Filme;
import com.mycompany.cineshow.Sessao;
import Controller.ControlaCadastroFilme;

import java.io.File;
import java.util.ArrayList;

public class SessaoDao extends PersistenciaDao<Sessao>{
    @Override
    public ArrayList<Sessao> ler() {
        ArrayList<Sessao> sessoes = new ArrayList<>();
        Arquivo arq = new Arquivo("sessao.txt");
        ControlaCadastroFilme cf = new ControlaCadastroFilme();
        if (arq.abrirLeitura()) {
            while (true) {
                String titulo = arq.lerLinha();
                if (titulo == null) {
                    break; 
                }

                String salaText = arq.lerLinha();
                String duracaoText = arq.lerLinha();
                String horario = arq.lerLinha();
                int sala = Integer.parseInt(salaText);
                int duracao = Integer.parseInt(duracaoText);
                
                Filme filme = cf.retornaPorNome(titulo);
                Sessao sessao = new Sessao(filme, horario, duracao, sala);
                sessoes.add(sessao);
            }
            arq.fecharArquivo();
        }
        return sessoes;
    }
    @Override
    public boolean salvar(Sessao sessao) {
        Arquivo arq = new Arquivo("sessao.txt");

        if (arq.abrirEscrita()) {
            arq.escreverLinha(sessao.getFilme() + "");
            arq.escreverLinha(sessao.getSala()+ "");
            arq.escreverLinha(sessao.getDuracao() + "");
            arq.escreverLinha(sessao.getHorario());
                
            arq.fecharArquivo();
            return true;
        }
        return false;
    }

    public void apagaArquivo(){
        File file = new File("sessao.txt");
        if (file.exists()) {
            file.delete();
        }    
    }
}
