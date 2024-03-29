/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.cineshow.telas;


import Controller.ControlaFuncionario;
import com.mycompany.cineshow.Funcionario;
import com.mycompany.cineshow.exceptions.FuncionarioException;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author solan
 */
public class dlgMostraFuncionarios extends JFrame {

    /**
     * Creates new form dlgMostraFuncionarios
     */
    ControlaFuncionario cf = new ControlaFuncionario();
    public dlgMostraFuncionarios(){
        initComponents();
        exibeInformacoes();
        exibeLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListFunc = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        tfCpf = new javax.swing.JTextField();
        tfdSalario = new javax.swing.JTextField();
        tfdEndereco = new javax.swing.JTextField();
        tfdTelefone = new javax.swing.JTextField();
        tfdEmail = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionários cadastrados");
        setPreferredSize(new java.awt.Dimension(918, 479));
        setResizable(false);


        jListFunc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funcionários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jListFunc.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                exibeInformacoes();
            }
        });

        jScrollPane1.setViewportView(jListFunc);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14)))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("CPF");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Salário");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Endereço");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Telefone");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        tfdNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdNomeActionPerformed(evt);
            }
        });

        tfCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfdSalario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfdEndereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfdTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfdEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdEmailActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(240, 240, 240));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEditar.setText("Editar ");
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnEditarActionPerformed(evt);
                } catch (FuncionarioException e) {
                    JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        btnRemover.setBackground(new java.awt.Color(240, 240, 240));
        btnRemover.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnRemoverActionPerformed(evt);
                } catch (FuncionarioException e) {
                    JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        btnAdicionar.setBackground(new java.awt.Color(240, 240, 240));
        btnAdicionar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnAdicionarActionPerformed(evt);
                } catch (FuncionarioException e) {
                    // TODO Auto-generated catch block
                    JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        btnVoltar.setBackground(new java.awt.Color(240, 240, 240));
        btnVoltar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCpf)
                            .addComponent(tfdSalario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdEndereco))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdTelefone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 312, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfdSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfdTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdNomeActionPerformed

    private void tfdEmailActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        List<Funcionario> copiaFuncionarios = new ArrayList<>(cf.retornarTodos());
        cf.getFuncionarioDao().apagaArquivo();
        for (Funcionario f : copiaFuncionarios) {
            cf.salvar(f);
        }
        this.dispose();
        TelaDashBoard.desenha(usuario);
    }

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) throws FuncionarioException{//GEN-FIRST:event_btnRemoverActionPerformed
        int indice = jListFunc.getSelectedIndex();

        if(indice != -1){
            DefaultListModel model = (DefaultListModel)jListFunc.getModel();
            model.remove(indice);
            cf.retornarTodos().remove(indice);

            JOptionPane.showMessageDialog(
            null,
            "Funcionário removido com sucesso!",
            "Confirmação",
            JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            throw new FuncionarioException("Selecione um funcionário para remover");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) throws FuncionarioException{//GEN-FIRST:event_btnEditarActionPerformed
        int indice = jListFunc.getSelectedIndex();

        if(indice != -1){
            String nomeSelecionado = jListFunc.getSelectedValue();
            Funcionario funcionario = cf.retornaPorNome(nomeSelecionado);

            funcionario.setNome(tfdNome.getText());
            funcionario.setEndereco(tfdEndereco.getText());
            funcionario.setEmail(tfdEmail.getText());
            funcionario.setSalario(Double.parseDouble(tfdSalario.getText()));
            funcionario.setTelefone(tfdTelefone.getText());
            funcionario.setCpf(tfCpf.getText());

            if(funcionario.getNome().isEmpty() || funcionario.getCpf().isEmpty() || funcionario.getEmail().isEmpty() || funcionario.getEndereco().isEmpty()){
                throw new FuncionarioException("Preencha todos os campos");
            }

            if(funcionario.getSalario() < 0){
                throw new FuncionarioException("Preencha um valor válido para o campo de salário");
            }

            if(cf.salvaObjetoComIndice(funcionario, indice)){
                exibeLista();
                JOptionPane.showMessageDialog(null,"Funcionário editado com sucesso!","Confirmação",JOptionPane.INFORMATION_MESSAGE);

            } 
        }    
        else {
            throw new FuncionarioException("Selecione um funcionário para editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) throws FuncionarioException{//GEN-FIRST:event_btnEditarActionPerformed
        
        if(tfdNome.getText().isEmpty() || tfCpf.getText().isEmpty() || tfdEndereco.getText().isEmpty() || tfdEmail.getText().isEmpty() || tfdSalario.getText().isEmpty()){
            throw new FuncionarioException("Preencha todos os campos");
        }
        
        String nome = tfdNome.getText();
        String cpf = tfCpf.getText();
        double salario = Double.parseDouble(tfdSalario.getText());
        String endereco = tfdEndereco.getText();
        String telefone = tfdTelefone.getText();
        String email = tfdEmail.getText();

        if(salario < 0){
            throw new FuncionarioException("Preencha um valor válido para o campo de salário");
        }
        
        Funcionario funcionario = new Funcionario(nome, endereco, email, telefone, salario, cpf);
        cf.salvar(funcionario);


        JOptionPane.showMessageDialog(
            null,
            "Funcionário cadastrado com sucesso!",
            "Confirmação",
                JOptionPane.INFORMATION_MESSAGE
        );

        exibeLista();
        tfdNome.setText("");
        tfCpf.setText("");
        tfdSalario.setText("");
        tfdEndereco.setText("");
        tfdTelefone.setText("");
        tfdEmail.setText("");
    }//GEN-LAST:event_btnEditarActionPerformed

    public static void desenha(String user){
        usuario = user;
        dlgMostraFuncionarios cadFuncionarios = new dlgMostraFuncionarios();
        int width = 900;
        int height = 550;
        cadFuncionarios.setSize(width, height);
        cadFuncionarios.setLocationRelativeTo(null);
        cadFuncionarios.setVisible(true);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {   
        List<Funcionario> lista = cf.getFuncionarioDao().ler();
        for (Funcionario funcionario : lista) {
            if (!cf.salvar(funcionario)) {
                JOptionPane.showMessageDialog(null,"Erro ao salvar funcionario","Erro",JOptionPane.ERROR_MESSAGE);

            }
        }
        exibeLista();
        exibeInformacoes();
        
    }                                 

    private void formWindowClosing(java.awt.event.WindowEvent evt) {      
        List<Funcionario> copiaFuncionarios = new ArrayList<>(cf.retornarTodos());
        cf.getFuncionarioDao().apagaArquivo();
        for (Funcionario f : copiaFuncionarios) {
            cf.salvar(f);
        }
    }     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dlgMostraFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgMostraFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgMostraFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgMostraFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        dlgMostraFuncionarios dialog = new dlgMostraFuncionarios();
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //dlgMostraFuncionarios dialog = new dlgMostraFuncionarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });

                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });
    }

    private void exibeLista(){
        ArrayList<Funcionario> funcionarios = cf.retornarTodos();
        DefaultListModel<String> model = new DefaultListModel<>();

        for (Funcionario funcionario : funcionarios) {
            model.addElement(funcionario.getNome());
        }

        jListFunc.setModel(model);
    }

    private void exibeInformacoes() {
        int index = jListFunc.getSelectedIndex();

        if (index != -1) {
            String funcSelecionado = jListFunc.getSelectedValue();
            Funcionario funcionario = cf.retornaPorNome(funcSelecionado);
            tfdNome.setText(funcionario.getNome());
            tfdEndereco.setText(funcionario.getEndereco());
            tfdSalario.setText(String.valueOf(funcionario.getSalario()));
            tfdEmail.setText(funcionario.getEmail());
            tfdTelefone.setText(funcionario.getTelefone());
            tfCpf.setText(funcionario.getCpf());
        }
        else{
            tfdNome.setText("");
            tfCpf.setText("");
            tfdEndereco.setText("");
            tfdSalario.setText("");
            tfdEmail.setText("");
            tfdTelefone.setText("");

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListFunc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfdEmail;
    private javax.swing.JTextField tfdEndereco;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdSalario;
    private javax.swing.JTextField tfdTelefone;
    private static String usuario;
    // End of variables declaration//GEN-END:variables
}
