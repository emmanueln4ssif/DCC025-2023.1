/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package persistencia;
import com.mycompany.cineshow.Funcionario;

import java.io.File;
import java.util.ArrayList;

        public class FuncionarioDao extends PersistenciaDao<Funcionario> {

            @Override
            public ArrayList<Funcionario> ler() {
                ArrayList<Funcionario> funcionarios = new ArrayList<>();
                Arquivo arq = new Arquivo("funcionario.txt");

                if (arq.abrirLeitura()) {
                    while (true) {
                        String nome = arq.lerLinha();
                        if (nome == null) {
                            break; // Encerra o loop quando não há mais títulos para ler
                        }
                        String cpf = arq.lerLinha();
                        String endereco = arq.lerLinha();
                        String email = arq.lerLinha();
                        String telefone = arq.lerLinha();
                        double salario = Double.parseDouble(arq.lerLinha());

                        Funcionario funcionario = new Funcionario(nome, endereco, email, telefone, salario, cpf);
                        funcionarios.add(funcionario);
                    }

                    arq.fecharArquivo();
                }

                return funcionarios;
            }
            @Override
            public boolean salvar(Funcionario funcionario) {
                Arquivo arq = new Arquivo("funcionario.txt");

                if (arq.abrirEscrita()) {
                    arq.escreverLinha(funcionario.getNome() + "");
                    arq.escreverLinha(funcionario.getCpf());
                    arq.escreverLinha(funcionario.getEndereco() + "");
                    arq.escreverLinha(funcionario.getEmail() + "");
                    arq.escreverLinha(funcionario.getTelefone() + "");
                    arq.escreverLinha(Double.toString(funcionario.getSalario()) + "");

                    arq.fecharArquivo();
                    return true;
                }
                return false;
            }

            public void apagaArquivo(){
                File file = new File("funcionario.txt");
                if (file.exists()) {
                    file.delete();
                }    
            }

        }