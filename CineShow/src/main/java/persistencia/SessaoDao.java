package persistencia;

import com.mycompany.cineshow.Filme;
import com.mycompany.cineshow.Sessao;
import java.util.ArrayList;

        public class SessaoDao {

        /*     public ArrayList<Sessao> ler() {
                ArrayList<Sessao> sessoes = new ArrayList<>();
                Arquivo arq = new Arquivo("sessao.txt");

                if (arq.abrirLeitura()) {
                    while (true) {
                        Filme filme = filme.toString(arq.lerLinha());
                        if (filme.getTitulo() == null) {
                            break; // Encerra o loop quando não há mais títulos para ler
                        }
                        int sala = Integer.parseInt(arq.lerLinha());
                        int duracao = Integer.parseInt(arq.lerLinha());
                        String horario = arq.lerLinha();

                        Sessao sessao = new Sessao(filme, horario, duracao, sala);
                        sessoes.add(sessao);
                    }

                    arq.fecharArquivo();
                }

                return sessoes;
            

            public boolean salvar(Sessao sessao) {
                Arquivo arq = new Arquivo("sessao.txt");

                if (arq.abrirEscrita()) {
                    arq.escreverLinha(sessao.getNome() + "");
                    arq.escreverLinha(sessao.getEndereco() + "");
                    arq.escreverLinha(sessao.getEmail() + "");
                    arq.escreverLinha(sessao.getCpf());
                    arq.escreverLinha(sessao.getTelefone() + "");

                    arq.fecharArquivo();
                    return true;
                }
                return false;
            }
            }*/
        }
