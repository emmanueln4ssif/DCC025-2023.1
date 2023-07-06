/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.cineshow.telas.cadastroFilme;

import com.mycompany.cineshow.Filme;
import com.mycompany.cineshow.exceptions.FilmeException;
import com.mycompany.cineshow.telas.dashBoard.TelaDashBoard;
import com.mycompany.cineshow.telas.dashBoard.TelaDashBoardFuncionario;

import java.util.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author solan
 */
public class dlgMostraFilmes extends JFrame {

    /**
     * Creates new form dlgMostraFilmes
     */

    ControlaCadastroFilme cf = new ControlaCadastroFilme();

    public dlgMostraFilmes() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListFilmes = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        panelDescricao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        tfdTitulo = new javax.swing.JTextField();
        tfdClassificacao = new javax.swing.JTextField();
        btnRemover = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        tfdGenero = new javax.swing.JTextField();
        tfdDuracao = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfdSinopse = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filmes Cadastrados");
        setResizable(false);
        setSize(new java.awt.Dimension(600, 0));

        jListFilmes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filmes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jListFilmes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jListFilmes);
        jListFilmes.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                exibeInformacoes();
            }
        });

        jPanel1.setLayout(null);

        panelDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")), "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        panelDescricao.setToolTipText("");
        panelDescricao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        panelDescricao.setName("Descrição"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Título");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Sinopse");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Classificação indicativa");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Gênero");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Duração");

        btnAdicionar.setBackground(new java.awt.Color(240, 240, 240));
        btnAdicionar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnAdicionarActionPerformed(evt);
                } catch (FilmeException e) {
                    JOptionPane.showMessageDialog(
                null,
                    e.getMessage(),
                "Erro",
                    JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        tfdTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdClassificacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemover.setBackground(new java.awt.Color(240, 240, 240));
        btnRemover.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnRemoverActionPerformed(evt);
                } catch (FilmeException e) {
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

        btnEditar.setBackground(new java.awt.Color(240, 240, 240));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnEditarActionPerformed(evt);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(
                null,
                    e.getMessage(),
                "Erro",
                    JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        tfdGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfdDuracao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdDuracao.setAlignmentY(7.0F);

        tfdSinopse.setColumns(20);
        tfdSinopse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdSinopse.setLineWrap(true);
        tfdSinopse.setRows(5);
        jScrollPane2.setViewportView(tfdSinopse);

        javax.swing.GroupLayout panelDescricaoLayout = new javax.swing.GroupLayout(panelDescricao);
        panelDescricao.setLayout(panelDescricaoLayout);
        panelDescricaoLayout.setHorizontalGroup(
            panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDescricaoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        
                        .addComponent(tfdTitulo))
                    .addGroup(panelDescricaoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        
                        .addComponent(tfdGenero))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDescricaoLayout.createSequentialGroup()
                        .addGap(0, 258, Short.MAX_VALUE)
                        .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDescricaoLayout.createSequentialGroup()
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDescricaoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        
                        .addComponent(tfdClassificacao))
                    .addGroup(panelDescricaoLayout.createSequentialGroup()
                        .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        
                        .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(tfdDuracao))))
                .addContainerGap())
        );
        panelDescricaoLayout.setVerticalGroup(
            panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescricaoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfdGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(panelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                
                .addComponent(panelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDescricao.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>                        

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) throws FilmeException{                                             
        String titulo = tfdTitulo.getText();
        int classificacao = Integer.parseInt(tfdClassificacao.getText());
        String genero = tfdGenero.getText();
        String duracao = tfdDuracao.getText();
        String sinopse = tfdSinopse.getText();

        if(titulo.isEmpty() || genero.isEmpty() || duracao.isEmpty() || sinopse.isEmpty()){
                throw new FilmeException("Preencha todos os campos");
        }

        if(classificacao > 18 || classificacao < 10)
                throw new FilmeException("Classificação Indicativa inválida");

        Filme filme = new Filme(titulo, sinopse, classificacao , genero, duracao);

        cf.salvar(filme);

        exibeLista();

        tfdTitulo.setText("");
        tfdSinopse.setText("");
        tfdClassificacao.setText("");
        tfdGenero.setText("");
        tfdDuracao.setText("");

        JOptionPane.showMessageDialog(
            null,
            "Filme cadastrado com sucesso!",
            "Confirmação",
                JOptionPane.INFORMATION_MESSAGE
        );
        
    }                                            

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) throws FilmeException{                                           
        // TODO add your handling code here:
        int indice = jListFilmes.getSelectedIndex();

        if(indice != -1){
            DefaultListModel model = (DefaultListModel)jListFilmes.getModel();
            model.remove(indice);
            cf.retornarTodos().remove(indice);

            JOptionPane.showMessageDialog(
            null,
            "Filme removido com sucesso!",
            "Confirmação",
            JOptionPane.INFORMATION_MESSAGE
                );

        } else {
            throw new FilmeException("Selecione um filme para remover");
        }
    }                                          

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) throws FilmeException{                                          
        int indice = jListFilmes.getSelectedIndex();

        if(indice != -1){
            String tituloSelecionado = jListFilmes.getSelectedValue();
            Filme filme = cf.retornaFilmePorTitulo(tituloSelecionado);
         
            filme.setTitulo(tfdTitulo.getText());
            filme.setGenero(tfdGenero.getText());
            filme.setDuracao(tfdDuracao.getText());
            filme.setClassificacaoIndicativa(Integer.parseInt(tfdClassificacao.getText()));
            filme.setSinopse(tfdSinopse.getText());

            if(filme.getTitulo().isEmpty() || filme.getGenero().isEmpty() || filme.getDuracao().isEmpty() || filme.getSinopse().isEmpty())
                throw new FilmeException("Preencha todos os campos");

            if(filme.getClassificacaoIndicativa() > 18 || filme.getClassificacaoIndicativa() < 10)
                throw new FilmeException("Classificação Indicativa inválida");
            
            DefaultListModel<String> model = (DefaultListModel<String>) jListFilmes.getModel();
            model.setElementAt(filme.getTitulo(), indice);
            
            exibeInformacoes();

            JOptionPane.showMessageDialog(
            null,
            "Filme editado com sucesso!",
            "Confirmação",
                JOptionPane.INFORMATION_MESSAGE
        );
          
        }
    }                                         

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        if(usuario.equals("admin"))
            TelaDashBoard.desenha(usuario);
        else
            TelaDashBoardFuncionario.desenha(usuario);
    }

    public static void desenha(String user){
        usuario = user;
        dlgMostraFilmes cadFilmes = new dlgMostraFilmes();
        int width = 940;
        int height = 550;
        cadFilmes.setSize(width, height);
        cadFilmes.setLocationRelativeTo(null);
        cadFilmes.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(dlgMostraFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgMostraFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgMostraFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgMostraFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgMostraFilmes dialog = new dlgMostraFilmes();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dlgMostraFilmes.desenha(usuario);
            }
        });
    }


    private void exibeLista(){
        ArrayList<Filme> filmes = cf.retornarTodos();
        DefaultListModel<String> model = new DefaultListModel<>();

        for (Filme filme : filmes) {
            model.addElement(filme.getTitulo());
        }

        jListFilmes.setModel(model);
    }

    
    private void exibeInformacoes() {
        int index = jListFilmes.getSelectedIndex();

        if (index != -1) {
            String tituloSelecionado = jListFilmes.getSelectedValue();
            Filme filme = cf.retornaFilmePorTitulo(tituloSelecionado);

            tfdTitulo.setText(filme.getTitulo());
            tfdSinopse.setText(filme.getSinopse());
            tfdClassificacao.setText(String.valueOf(filme.getClassificacaoIndicativa()));
            tfdGenero.setText(filme.getGenero());
            tfdDuracao.setText(filme.getDuracao());
        }
        else{
            tfdTitulo.setText("");
            tfdSinopse.setText("");
            tfdClassificacao.setText("");
            tfdGenero.setText("");
            tfdDuracao.setText("");
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListFilmes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelDescricao;
    private javax.swing.JTextField tfdClassificacao;
    private javax.swing.JTextField tfdDuracao;
    private javax.swing.JTextField tfdGenero;
    private javax.swing.JTextArea tfdSinopse;
    private javax.swing.JTextField tfdTitulo;
    private static String usuario;
    // End of variables declaration                   
}
