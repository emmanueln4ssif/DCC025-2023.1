package persistencia;

import com.mycompany.cineshow.Cliente;
import java.util.ArrayList;

        public class ClienteDao extends PersistenciaDao<Cliente> {
            @Override
            public ArrayList<Cliente> ler() {
                ArrayList<Cliente> clientes = new ArrayList<>();
                Arquivo arq = new Arquivo("cliente.txt");

                if (arq.abrirLeitura()) {
                    while (true) {
                        String nome = arq.lerLinha();
                        if (nome == null) {
                            break; // Encerra o loop quando não há mais títulos para ler
                        }
                        String endereco = arq.lerLinha();
                        String email = arq.lerLinha();
                        String telefone = arq.lerLinha();
                        String cpf = arq.lerLinha();

                        Cliente cliente = new Cliente(nome, endereco, email, cpf, telefone);
                        clientes.add(cliente);
                    }

                    arq.fecharArquivo();
                }

                return clientes;
            }
            @Override
            public boolean salvar(Cliente cliente) {
                Arquivo arq = new Arquivo("cliente.txt");

                if (arq.abrirEscrita()) {
                    arq.escreverLinha(cliente.getNome() + "");
                    arq.escreverLinha(cliente.getEndereco() + "");
                    arq.escreverLinha(cliente.getEmail() + "");
                    arq.escreverLinha(cliente.getCpf());
                    arq.escreverLinha(cliente.getTelefone() + "");

                    arq.fecharArquivo();
                    return true;
                }
                return false;
            }
        }
