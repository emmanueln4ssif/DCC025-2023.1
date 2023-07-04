package com.mycompany.cineshow.telas.telaCadCliente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.mycompany.cineshow.Cliente;
import com.mycompany.cineshow.Cliente;
import com.mycompany.cineshow.Cliente;
import com.mycompany.cineshow.Cliente;
import com.mycompany.cineshow.telas.dashBoard.TelaDashBoard;

/**
 *
 * @author walac
 */
public class TelaCadCliente extends JFrame {

    /**
     * Creates new form telaCadCliente
     */
    ControlaCliente cf = new ControlaCliente();

    public TelaCadCliente() {
        initComponents();
        exibeInformacoes();
        exibeLista();
        tfdId.setVisible(false);
        jLabel5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new JScrollPane();
        jListClientes = new JList<>();
        jPanel1 = new JPanel();
        panelDescricao = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();

        btnAdicionar = new JButton();
        tfdNome = new JTextField();
        tfdTelefone = new JTextField();
        btnRemover = new JButton();
        btnVoltar = new JButton();
        btnEditar = new JButton();
        tfdEmail = new JTextField();
        tfdEndereco = new JTextField();
        tfdId = new JTextField();
        tfCpf = new JTextField();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes Cadastrados");
        setResizable(false);
        setSize(new Dimension(600, 0));

        jListClientes.setBorder(BorderFactory.createTitledBorder(null, "Clientes", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Segoe UI", 1, 14))); // NOI18N
        jListClientes.setFont(new Font("Dialog", 1, 14)); // NOI18N
        
        jScrollPane1.setViewportView(jListClientes);
        jListClientes.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                exibeInformacoes();
            }
        });

        jPanel1.setLayout(null);

        panelDescricao.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder("")), "Descrição", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Segoe UI", 1, 14))); // NOI18N
        panelDescricao.setToolTipText("");
        panelDescricao.setFont(new Font("Dialog", 0, 12)); // NOI18N
        panelDescricao.setName("Descrição"); // NOI18N

        jLabel1.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nome ");

        jLabel2.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("CPF ");

        jLabel3.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Telefone ");

        jLabel4.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Email ");

        jLabel5.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("ID ");

        jLabel6.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Endereço ");

        btnAdicionar.setBackground(new Color(240, 240, 240));
        btnAdicionar.setFont(new Font("Dialog", 1, 12)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        tfdNome.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        tfdNome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //tfdNomeActionPerformed(evt); TODO
            }
        });

        tfdTelefone.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        tfdTelefone.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //tfdTelefoneActionPerformed(evt); TODO
            }
        });

        btnRemover.setBackground(new Color(240, 240, 240));
        btnRemover.setFont(new Font("Dialog", 1, 12)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btnRemover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               btnRemoverActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new Color(240, 240, 240));
        btnVoltar.setFont(new Font("Dialog", 1, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new Color(240, 240, 240));
        btnEditar.setFont(new Font("Dialog", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btnEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnEditarActionPerformed(evt); 
            }
        });

        tfdEmail.setFont(new Font("Segoe UI", 0, 14)); // NOI18N

        tfdId.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        tfdId.setAlignmentY(7.0F);

        //tfCpf.setColumns(20);
        tfCpf.setFont(new Font("Segoe UI", 0, 14)); // NOI18N

        tfdEndereco.setFont(new Font("Segoe UI", 0, 14)); // NOI18N

        GroupLayout panelDescricaoLayout = new GroupLayout(panelDescricao);
        panelDescricao.setLayout(panelDescricaoLayout);
        panelDescricaoLayout.setHorizontalGroup(
                panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelDescricaoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelDescricaoLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addComponent(tfdNome))
                                        .addGroup(panelDescricaoLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addComponent(tfCpf))
                                        .addGroup(panelDescricaoLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addComponent(tfdEmail))
                                        .addGroup(panelDescricaoLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addComponent(tfdId))
                                        .addGroup(panelDescricaoLayout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addComponent(tfdEndereco))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelDescricaoLayout.createSequentialGroup()
                                                .addGap(0, 258, 258)
                                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, panelDescricaoLayout.createSequentialGroup()
                                                                .addComponent(btnAdicionar, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnRemover, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(btnVoltar, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelDescricaoLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addComponent(tfdTelefone)))
                                .addContainerGap())
        );
        panelDescricaoLayout.setVerticalGroup(
                panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelDescricaoLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(tfdNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(tfdEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfdTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(21, 21, 21)
                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfdId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(21, 21, 21)
                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfdEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(tfCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(43, 43, 43)
                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAdicionar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRemover, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(panelDescricao, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, GroupLayout.Alignment.LEADING))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        TelaDashBoard.desenha();
    }

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int indice = jListClientes.getSelectedIndex();

        if(indice != -1){
            DefaultListModel model = (DefaultListModel)jListClientes.getModel();
            model.remove(indice);
            cf.retornarTodos().remove(indice);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

        private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int indice = jListClientes.getSelectedIndex();

        if(indice != -1){
            String cpfSelecionado = jListClientes.getSelectedValue();
            Cliente cliente = cf.retornaClienteCPF(cpfSelecionado);
            DefaultListModel model = (DefaultListModel)jListClientes.getModel();

            cliente.setNome(tfdNome.getText());
            cliente.setEndereco(tfdEndereco.getText());
            cliente.setEmail(tfdEmail.getText());
            cliente.setTelefone(tfdTelefone.getText());
            cliente.setCpf(tfCpf.getText());
            model.setElementAt(cliente.getNome(), indice);

            exibeInformacoes();

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
            String nome = tfdNome.getText();
            String cpf = tfCpf.getText();
            String endereco = tfdEndereco.getText();
            String telefone = tfdTelefone.getText();
            String email = tfdEmail.getText();
            
            Cliente cliente = new Cliente(nome, endereco, email, telefone, cpf);
            
            cf.salvar(cliente);
            exibeLista();

            tfdNome.setText("");
            tfCpf.setText("");
            tfdEndereco.setText("");
            tfdTelefone.setText("");
            tfdEmail.setText("");
    }//GEN-LAST:event_btnEditarActionPerformed


    private void exibeLista(){
        ArrayList<Cliente> clientes = cf.retornarTodos();
        DefaultListModel<String> model = new DefaultListModel<>();

        for (Cliente cliente : clientes) {
            model.addElement(cliente.getCpf());
        }

        jListClientes.setModel(model);
    }

    private void exibeInformacoes() {
        int index = jListClientes.getSelectedIndex();

        if (index != -1) {
            String funcSelecionado = jListClientes.getSelectedValue();
            Cliente cliente = cf.retornaClienteCPF(funcSelecionado);
            tfdNome.setText(cliente.getNome());
            tfdEndereco.setText(cliente.getEndereco());
            tfdEmail.setText(cliente.getEmail());
            tfdTelefone.setText(cliente.getTelefone());
            tfCpf.setText(cliente.getCpf());
        }
        else{
            tfdNome.setText("");
            tfCpf.setText("");
            tfdEndereco.setText("");
            tfdEmail.setText("");
            tfdTelefone.setText("");

        }
    }

    public static void desenha(){
        TelaCadCliente telaCadCliente = new TelaCadCliente();

        // Definir o tamanho da tela
        int width = 920;
        int height = 550;
        telaCadCliente.setSize(width, height);
        // Centralizar a tela na página
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        telaCadCliente.setLocationRelativeTo(null);
        telaCadCliente.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadCliente.desenha();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAdicionar;
    private JButton btnEditar;
    private JButton btnRemover;
    private JButton btnVoltar;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JList<String> jListClientes;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JPanel panelDescricao;
    private JTextField tfdTelefone;
    private JTextField tfdId;
    private JTextField tfdEmail;
    private JTextField tfCpf;
    private JTextField tfdNome;
    private JTextField tfdEndereco;
    // End of variables declaration//GEN-END:variables
}
