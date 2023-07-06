/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
*/
package com.mycompany.cineshow.telas.login;

import com.mycompany.cineshow.Funcionario;
import com.mycompany.cineshow.exceptions.LoginException;
import com.mycompany.cineshow.telas.cadastramentoFuncionario.ControlaFuncionario;
import com.mycompany.cineshow.telas.dashBoard.TelaDashBoard;
import com.mycompany.cineshow.telas.dashBoard.TelaDashBoardFuncionario;

import java.awt.event.*;
import java.util.*;
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
  private static String usuario;

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

    jLabel2.setText("Senha");

    butLogin.setText("Login");
    butLogin.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
          butLoginActionPerformed(evt);
        }
      }
    );

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("imgLogin.png"))); // NOI18N
    //jLabel5.setSize(200, 100);
    jLabel5.setMaximumSize(new java.awt.Dimension(600, 400));
    jLabel5.setMinimumSize(new java.awt.Dimension(10, 5));

    jLabel6.setBackground(new java.awt.Color(242, 242, 2));
    jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
    jLabel6.setText("CineShow");

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
                        .addComponent(butLogin,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE)
                        .addComponent(pfSenha,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      306,
                      Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(00, 00, 96))
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
                .addComponent( tfUsuario,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfSenha,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(butLogin)
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

    getContentPane().add(jPanel1);
    jPanel1.setBounds(0, 10, 937, 508);

   jLabel4.setIcon(new javax.swing.ImageIcon("CineShow\\src\\main\\java\\com\\mycompany\\cineshow\\telas\\login\\imgLogin.png")); // NOI18N
    jLabel4.setText("jLabel4");
    getContentPane().add(jLabel4);
    jLabel4.setBounds(911, 1733, 415, 348);

    pack();
  }

  private void butLoginActionPerformed(ActionEvent evt) {
    String nome = this.tfUsuario.getText();
    String senha = new String(this.pfSenha.getPassword());
    System.out.println(senha);

    try {
      if (nome.equals("admin@cineshow.br") && senha.equals("1234")) {
        usuario = "admin";
        this.dispose();
        TelaDashBoard.desenha(usuario);
      } else if (validaDadosDeLogin(nome, senha) == true) {
        usuario = "funcionario";
        this.dispose();
        TelaDashBoardFuncionario.desenha(usuario);
      } else if(nome.isEmpty() || senha.isEmpty()){
        throw new LoginException("Preencha todos os campos");
      } else {
        throw new LoginException("Usuário ou senha incorretos");
      }
    } catch (LoginException ex) {
      JOptionPane.showMessageDialog(
        null,
        ex.getMessage(),
        "Dados inválidos",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }

  public static boolean validaDadosDeLogin(String email, String senha) {
    ControlaFuncionario cf = new ControlaFuncionario();

    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    funcionarios = cf.retornarTodos();

    for (Funcionario funcionario : funcionarios) {
      if (
        funcionario.getEmail().equals(email) &&
        funcionario.getCpf().equals(senha)
      ) return true;
    }

    return false;
  }

  public static void desenha() {
    TelaLogin tela = new TelaLogin();
    int width = 900;
    int height = 490;
    tela.setSize(width, height);
    tela.setLocationRelativeTo(null);
    tela.setResizable(false);
    tela.setVisible(true);
  }

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
      java.util.logging.Logger
        .getLogger(TelaLogin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(TelaLogin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(TelaLogin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(TelaLogin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          
          TelaLogin telaLogin = new TelaLogin();
          int width = 900;
          int height = 550;
          telaLogin.setSize(width, height);
          telaLogin.setLocationRelativeTo(null);
          telaLogin.setVisible(true);
         
        }
      }
    );
  }
}
