/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cineshow.telas.dashBoard;

import com.mycompany.cineshow.Filme;
import com.mycompany.cineshow.telas.cadastroFilme.CadastroFilme;
import com.mycompany.cineshow.telas.telaCadCliente.TelaCadCliente;
import com.mycompany.cineshow.telas.telaSessoes.TelaSessoes;
import com.mycompany.cineshow.telas.filmeIndividual.telainicialfilme;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author walac
 */
public class TelaDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form TelaDashBoard
     */
    public TelaDashBoard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel6 = new JLabel();
        butCadCliente = new Button();
        butCadFilme = new Button();
        butFilmeDia = new Button();
        butSessoes = new Button();
        butIngressos = new Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new Color(0, 0, 0));

        jLabel1.setFont(new Font("Rage Italic", 0, 24)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("CineShow");

        jLabel6.setBackground(new Color(0, 0, 0));
        jLabel6.setFont(new Font("Segoe UI Emoji", 1, 48)); // NOI18N
        jLabel6.setForeground(new Color(0, 0, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bem vindo ao CineShow!");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 230);

        butCadCliente.setFont(new Font("Dialog", 1, 12)); // NOI18N
        butCadCliente.setLabel("Clientes");
        getContentPane().add(butCadCliente);
        butCadCliente.setBounds(20, 420, 160, 50);
        butCadCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                butCadClienteActionPerformed(evt);
            }
        });

        butCadFilme.setFont(new Font("Dialog", 1, 12)); // NOI18N
        butCadFilme.setLabel("Filmes");
        getContentPane().add(butCadFilme);
        butCadFilme.setBounds(190, 420, 160, 50);
        butCadFilme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                butCadFilmeActionPerformed(evt);
            }
        });

        butFilmeDia.setFont(new Font("Dialog", 1, 12)); // NOI18N
        butFilmeDia.setLabel("Funcionários");
        getContentPane().add(butFilmeDia);
        butFilmeDia.setBounds(360, 420, 160, 50);
        butFilmeDia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                butFilmeDiaActionPerformed(evt);
            }
        });

        butSessoes.setFont(new Font("Dialog", 1, 12)); // NOI18N
        butSessoes.setLabel("Sessões");
        getContentPane().add(butSessoes);
        butSessoes.setBounds(530, 420, 160, 50);
        butSessoes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                butSessoesPerformed(evt);
            }
        });

        butIngressos.setFont(new Font("Dialog", 1, 12)); // NOI18N
        butIngressos.setLabel("Ingresso");
        getContentPane().add(butIngressos);
        butIngressos.setBounds(700, 420, 160, 50);

        pack();
    }
    private void jLabel6FocusGained(FocusEvent evt) {//GEN-FIRST:event_jLabel6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6FocusGained

  private void butCadClienteActionPerformed (java.awt.event.ActionEvent evt) {
        TelaCadCliente telaCadCliente = new TelaCadCliente();
        telaCadCliente.setExtendedState(TelaDashBoard.MAXIMIZED_BOTH);
        this.dispose();
        telaCadCliente.setVisible(true);
    }

  private void butCadFilmeActionPerformed (java.awt.event.ActionEvent evt) {
        CadastroFilme cadastroFilme = new CadastroFilme();
        cadastroFilme.setExtendedState(TelaDashBoard.MAXIMIZED_BOTH);
        this.dispose();
        cadastroFilme.setVisible(true);
    }

      private void butSessoesPerformed (java.awt.event.ActionEvent evt) {
        TelaSessoes cadastroFilme = new TelaSessoes();
        cadastroFilme.setExtendedState(TelaDashBoard.MAXIMIZED_BOTH);
        this.dispose();
        cadastroFilme.setVisible(true);
    }

    private void butFilmeDiaActionPerformed (java.awt.event.ActionEvent evt) {
        telainicialfilme telaFilme = new telainicialfilme();
        telaFilme.setExtendedState(telainicialfilme.MAXIMIZED_BOTH);
        this.dispose();
        telaFilme.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button butCadCliente;
    private Button butCadFilme;
    private Button butFilmeDia;
    private Button butSessoes;
    private Button butIngressos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
