/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cineshow.telas.login;

import com.mycompany.cineshow.telas.dashBoard.TelaDashBoard;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author emman
 */
public class TelaLogin extends javax.swing.JFrame {
    private javax.swing.JButton butLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfUsuario;

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel3 = new JLabel();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        tfUsuario = new JTextField();
        pfSenha = new JPasswordField();
        jLabel2 = new JLabel();
        butLogin = new JButton();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel4 = new JLabel();



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Usuário");

        tfUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });

        pfSenha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pfSenhaActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha");


        butLogin.setText("Login");
        butLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                butLoginActionPerformed(evt);
            }
        });

        //jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("CineShow/src/main/java/com/mycompany/cineshow/interfaceswing/login/imgLogin.png"))); // NOI18N
        //jLabel5.setMaximumSize(new java.awt.Dimension(500, 400));
        //jLabel5.setMinimumSize(new java.awt.Dimension(10, 5));

        jLabel6.setBackground(new java.awt.Color(242, 242, 2));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel6.setText("CineShow");
        jLabel6.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                jLabel6FocusGained(evt);
            }
        });

        jLabel7.setText("A magia que salta das telas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfUsuario)
                        .addComponent(jLabel1)
                        .addComponent(butLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(butLogin)
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 10, 937, 508);

        //jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\emman\\Desktop\\drawing-ticket-film-sketch-circus-ticket.jpg")); // NOI18N
        //jLabel4.setText("jLabel4");
        //getContentPane().add(jLabel4);
        //jLabel4.setBounds(911, 1733, 415, 348);

        pack();
    }

    private void butLoginActionPerformed(ActionEvent evt) {//GEN-FIRST:event_butLoginActionPerformed
        String nome = this.tfUsuario.getText();
        String senha = new String (this.pfSenha.getPassword());
        System.out.println(senha);

        if(nome.equals("Admin") && senha.equals("1234")){
            this.dispose();
            TelaDashBoard.desenha();
        }
    }

    private void tfUsuarioActionPerformed(ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void jLabel6FocusGained(FocusEvent evt) {//GEN-FIRST:event_jLabel6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6FocusGained

    private void pfSenhaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_pfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogin telaLogin = new TelaLogin();
                int width = 900;
                int height = 550;
                telaLogin.setSize(width, height);
                telaLogin.setLocationRelativeTo(null);
                telaLogin.setVisible(true);
            }
        });
    }

}
