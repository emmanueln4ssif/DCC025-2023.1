package com.mycompany.cineshow.telas.telaSessoes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
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

import com.mycompany.cineshow.telas.dashBoard.TelaDashBoard;

/**
 *
 * @author emman
 */

//package com.mycompany.cineshow.telas.telaCadCliente;
//import com.mycompany.cineshow.telas.cadastroFilme.CadastroFilme;
//import com.mycompany.cineshow.telas.dashBoard.TelaDashBoard;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author emman
 */
public class TelaSessoes extends JFrame {

    /**
     * Creates new form telaCadCliente
     */
    public TelaSessoes() {
        initComponents();
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
        jListFilmes = new JList<>();
        jPanel1 = new JPanel();
        panelDescricao = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();

        btnAdicionar = new JButton();
        tfdFilme = new JTextField();
        tfdDuracao = new JTextField();
        btnRemover = new JButton();
        btnVoltar = new JButton();
        btnEditar = new JButton();
        tfdSala = new JTextField();
        tfdEndereco = new JTextField();
        tfdId = new JTextField();
        tfdHorario = new JTextField();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sessões");
        setResizable(false);
        setSize(new Dimension(600, 0));

        jListFilmes.setBorder(BorderFactory.createTitledBorder(null, "Sessões Cadastradas", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Segoe UI", 1, 14))); // NOI18N
        jListFilmes.setFont(new Font("Dialog", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jListFilmes);
        jListFilmes.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {

            }
        });

        jPanel1.setLayout(null);

        panelDescricao.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder("")), "Descrição", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Segoe UI", 1, 14))); // NOI18N
        panelDescricao.setToolTipText("");
        panelDescricao.setFont(new Font("Dialog", 0, 12)); // NOI18N
        panelDescricao.setName("Descrição"); // NOI18N

        jLabel1.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Filme ");

        jLabel2.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Horário ");

        jLabel3.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Duração ");

        jLabel4.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Sala ");

        btnAdicionar.setBackground(new Color(240, 240, 240));
        btnAdicionar.setFont(new Font("Dialog", 1, 12)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //btnAdicionarActionPerformed(evt); TODO
            }
        });

        tfdFilme.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        tfdFilme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //tfdNomeActionPerformed(evt); TODO
            }
        });

        tfdDuracao.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        tfdDuracao.addActionListener(new ActionListener() {
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
                //btnRemoverActionPerformed(evt); TODO
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
                //btnEditarActionPerformed(evt); TODO
            }
        });

        tfdSala.setFont(new Font("Segoe UI", 0, 14)); // NOI18N

        tfdId.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        tfdId.setAlignmentY(7.0F);

        //tfCPF.setColumns(20);
        tfdHorario.setFont(new Font("Segoe UI", 0, 14)); // NOI18N

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
                                                .addComponent(tfdFilme))
                                        .addGroup(panelDescricaoLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addComponent(tfdHorario))
                                        .addGroup(panelDescricaoLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addComponent(tfdSala))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelDescricaoLayout.createSequentialGroup()
                                                .addGap(0, 258, Short.MAX_VALUE)
                                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, panelDescricaoLayout.createSequentialGroup()
                                                                .addComponent(btnAdicionar, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnRemover, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(btnVoltar, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelDescricaoLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addComponent(tfdDuracao)))
                                .addContainerGap())
        );
        panelDescricaoLayout.setVerticalGroup(
                panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelDescricaoLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(tfdFilme, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(tfdSala, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfdDuracao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(panelDescricaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(tfdHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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

    public static void desenha(){
        TelaSessoes telaSessoes = new TelaSessoes();
        int width = 920;
        int height = 550;
        telaSessoes.setSize(width, height);
        telaSessoes.setLocationRelativeTo(null);
        telaSessoes.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaSessoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSessoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSessoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSessoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSessoes().setVisible(true);
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
    private JList<String> jListFilmes;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JPanel panelDescricao;
    private JTextField tfdDuracao;
    private JTextField tfdId;
    private JTextField tfdSala;
    private JTextField tfdHorario;
    private JTextField tfdFilme;
    private JTextField tfdEndereco;
    // End of variables declaration//GEN-END:variables
}



