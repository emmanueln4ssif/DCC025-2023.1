/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cineshow.telas.filmeIndividual;

import com.mycompany.cineshow.telas.dashBoard.TelaDashBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author walac
 */
public class telainicialfilme extends javax.swing.JFrame {

    public telainicialfilme() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        butVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 0));
        getContentPane().setLayout(null);
        jLabel2.setIcon(new ImageIcon("filme2.jpg"));
        System.out.println(jLabel2.getIcon().getIconHeight());
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 30, 287, 420);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jogos Vorazes: A Esperança - O Final");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 580, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Duração:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 80, 90, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Estúdio");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 360, 190, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Gênero:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 310, 210, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Classificação Indicativa: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 410, 170, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Lançamento:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 130, 130, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Jogos Vorazes - A Esperança - O Final");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 40, 260, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Sinopse:");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 180, 220, 130);

        butVoltar.setFont(new Font("Dialog", 1, 12)); // NOI18N
        butVoltar.setLabel("Voltar");
        getContentPane().add(butVoltar);
        butVoltar.setBounds(200, 420, 170, 50);
        butVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                butVoltarActionPerformed(evt);
            }
        });



        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butVoltarActionPerformed (java.awt.event.ActionEvent evt) {
        TelaDashBoard telaDashBoard = new TelaDashBoard();
        telaDashBoard.setExtendedState(TelaDashBoard.MAXIMIZED_BOTH);
        this.dispose();
        telaDashBoard.setVisible(true);
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
            java.util.logging.Logger.getLogger(telainicialfilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telainicialfilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telainicialfilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telainicialfilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telainicialfilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;

    private javax.swing.JButton butVoltar;

    // End of variables declaration//GEN-END:variables
}
