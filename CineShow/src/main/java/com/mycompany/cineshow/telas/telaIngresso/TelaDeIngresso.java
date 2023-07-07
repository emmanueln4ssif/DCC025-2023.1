

package com.mycompany.cineshow.telas.telaIngresso;

import com.mycompany.cineshow.Assento;
import com.mycompany.cineshow.Cliente;
import com.mycompany.cineshow.Sessao;
import com.mycompany.cineshow.exceptions.IngressoException;
import com.mycompany.cineshow.telas.dashBoard.TelaDashBoard;
import com.mycompany.cineshow.telas.dashBoard.TelaDashBoardFuncionario;
import com.mycompany.cineshow.telas.telaCadCliente.ControlaCliente;
import com.mycompany.cineshow.telas.telaSessoes.TelaSessoes;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author emman
 */
public class TelaDeIngresso extends javax.swing.JFrame {

  
    public TelaDeIngresso() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pagamento = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        jPanelBoleto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfdPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdtiposPagamento = new javax.swing.JComboBox<>();
        tfdPrecoFinal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanelCartao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfdSessões = new javax.swing.JComboBox<>();
        tfAssentosNum = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        tfdClientes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Pagamento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pagamento.setText("Ingressos");
        getContentPane().add(Pagamento);
        Pagamento.setBounds(390, 30, 80, 25);
        Pagamento.getAccessibleContext().setAccessibleName("Pagamento");

        getContentPane().add(canvas1);
        canvas1.setBounds(678, 209, 0, 0);

        jPanelBoleto.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço do Ticket"));

        jLabel2.setText("Tipo de Ingresso");

        tfdPreco.setBackground(new java.awt.Color(255, 255, 255));
        tfdPreco.setDisabledTextColor(new java.awt.Color(255, 0, 0));

        jLabel3.setText("Preço");

        tfdtiposPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inteira", "Meia-entrada" }));
        tfdtiposPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdtiposPagamentoActionPerformed(evt);
            }
        });

        for(int i = 0; i < TelaDeIngresso.criaListaClientes().length; i++){
            tfdClientes.setModel(new javax.swing.DefaultComboBoxModel<>(TelaDeIngresso.criaListaClientes()));
        }

        for(int i = 0; i < TelaSessoes.criaListaSessoes().length; i++){
            tfdSessões.setModel(new javax.swing.DefaultComboBoxModel<>(TelaSessoes.criaListaSessoes()));
        }

        tfdPrecoFinal.setEditable(false);
        tfdPrecoFinal.setBackground(new java.awt.Color(255, 255, 255));
        tfdPrecoFinal.setDisabledTextColor(new java.awt.Color(255, 0, 0));

        jLabel7.setText("Preço final");

        javax.swing.GroupLayout jPanelBoletoLayout = new javax.swing.GroupLayout(jPanelBoleto);
        jPanelBoleto.setLayout(jPanelBoletoLayout);
        jPanelBoletoLayout.setHorizontalGroup(
            jPanelBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoletoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBoletoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfdPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanelBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBoletoLayout.createSequentialGroup()
                        .addComponent(tfdtiposPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(tfdPrecoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBoletoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanelBoletoLayout.setVerticalGroup(
            jPanelBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoletoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdtiposPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdPrecoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBoleto);
        jPanelBoleto.setBounds(30, 340, 840, 120);
        jPanelBoleto.getAccessibleContext().setAccessibleName("Preço");

        jPanelCartao.setBorder(javax.swing.BorderFactory.createTitledBorder("Sessão"));
        jPanelCartao.setLayout(null);

        jLabel1.setText("Sessão");
        jPanelCartao.add(jLabel1);
        jLabel1.setBounds(28, 26, 60, 16);

        jLabel6.setText("Numero do Assento");
        jPanelCartao.add(jLabel6);
        jLabel6.setBounds(30, 90, 150, 16);

        tfdSessões.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdSessõesActionPerformed(evt);
            }
        });
        jPanelCartao.add(tfdSessões);
        tfdSessões.setBounds(30, 50, 770, 22);

        tfAssentosNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        tfAssentosNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAssentosNumActionPerformed(evt);
            }
        });
        jPanelCartao.add(tfAssentosNum);
        tfAssentosNum.setBounds(30, 110, 250, 22);

        getContentPane().add(jPanelCartao);
        jPanelCartao.setBounds(30, 150, 840, 170);

        jLabel5.setText("Selecione o cliente");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 90, 210, 16);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
                
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(630, 500, 110, 23);

        btnConfirmar.setText("Pagar");
        btnConfirmar.setActionCommand("Pagar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnConfirmarActionPerformed(evt);
                } catch (IngressoException e) {
                    JOptionPane.showMessageDialog(null,e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                } 
            }
        });
        getContentPane().add(btnConfirmar);
        btnConfirmar.setBounds(755, 500, 110, 23);
        btnConfirmar.getAccessibleContext().setAccessibleName("Pagar");

        tfdClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdClientesActionPerformed(evt);
            }
        });
        getContentPane().add(tfdClientes);
        tfdClientes.setBounds(40, 110, 250, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfdtiposPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdtiposPagamentoActionPerformed
        if(tfdPreco.getText() != null) {
            try{
                double preco = Double.parseDouble(tfdPreco.getText());
                if (tfdtiposPagamento.getSelectedItem().equals("Inteira")) {
                    tfdPrecoFinal.setText(tfdPreco.getText());
                } else {
                    double valor = Double.parseDouble(tfdPreco.getText());
                    tfdPrecoFinal.setText("" + valor/2);
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Valor inválido para o campo preço","Erro",JOptionPane.ERROR_MESSAGE);           
            }
        }
        else {
                JOptionPane.showMessageDialog(null,"O campo de preço está vazio","Erro",JOptionPane.ERROR_MESSAGE);

            }



    }//GEN-LAST:event_tfdtiposPagamentoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        if(usuario.equals("admin"))
            TelaDashBoard.desenha(usuario);
        else
            TelaDashBoardFuncionario.desenha(usuario);
    }

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) throws IngressoException{
        
        if (tfdClientes.getSelectedItem() == null || tfdSessões.getSelectedItem() == null || tfdPreco.getText().isEmpty() || 
                tfdtiposPagamento.getSelectedItem() == null || tfdPrecoFinal.getText().isEmpty()){ 
                throw new IngressoException("Preencha todos os campos");
        }
        else{
            try {
                double preco = Double.parseDouble(tfdPreco.getText());
                this.dispose(); 
                TelaDePagamento.desenha(usuario, tfdPrecoFinal.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Valor inválido para o campo preço","Erro",JOptionPane.ERROR_MESSAGE);
            }       
        }    
        
    }

    private void tfdClientesActionPerformed(java.awt.event.ActionEvent evt) {
        ControlaCliente cc = new ControlaCliente();
        tfdClientes.getSelectedItem();

    }


    private void tfdSessõesActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void tfAssentosNumActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    public static void desenha (String user){
        usuario = user;
        TelaDeIngresso TelaDeIngresso = new TelaDeIngresso();
        int width = 900;
        int height = 580;
        TelaDeIngresso.setSize(width, height);
        TelaDeIngresso.setLocationRelativeTo(null);
        TelaDeIngresso.setResizable(false);
        TelaDeIngresso.setVisible(true);
    }

    public static Cliente [] criaListaClientes(){

        ControlaCliente cc = new ControlaCliente();

        List<Cliente> clientesCadastrados = cc.retornarTodos();
        int tam = clientesCadastrados.size();

        Cliente [] clienteAB = new Cliente[tam];

        int i = 0;

        for(Cliente cliente : clientesCadastrados){
            clienteAB[i] = cliente;
            i++;
        }
        return clienteAB;
    }

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaDeIngresso.desenha(usuario);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pagamento;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelBoleto;
    private javax.swing.JPanel jPanelCartao;
    private javax.swing.JComboBox<String> tfAssentosNum;
    private javax.swing.JComboBox<Cliente> tfdClientes;
    private javax.swing.JTextField tfdPreco;
    private javax.swing.JTextField tfdPrecoFinal;
    private javax.swing.JComboBox<Sessao> tfdSessões;
    private javax.swing.JComboBox<String> tfdtiposPagamento;
    private static String usuario;

    // End of variables declaration//GEN-END:variables
}
