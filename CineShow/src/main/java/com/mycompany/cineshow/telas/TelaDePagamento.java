package com.mycompany.cineshow.telas;

import com.mycompany.cineshow.CartaoPagamento;
import com.mycompany.cineshow.Data;
import com.mycompany.cineshow.PagamentoCartao;
import com.mycompany.cineshow.exceptions.CartaoException;
import com.mycompany.cineshow.exceptions.DataException;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class TelaDePagamento extends JFrame {

    public TelaDePagamento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Pagamento = new JLabel();
        canvas1 = new Canvas();
        jPanelBoleto = new JPanel();
        jLabel2 = new JLabel();
        tfdCodigoBarras1 = new JTextField();
        tiposPagamento = new JComboBox<>();
        jPanelCartao = new JPanel();
        tfdNome = new JTextField();
        tfdNumeroCartao = new JTextField();
        tfdValidade = new JTextField();
        jLabel1 = new JLabel();
        jLabel4 = new JLabel();
        jLabel6 = new JLabel();
        tfdCVV1 = new JTextField();
        jLabel8 = new JLabel();
        jPanelPix = new JPanel();
        tfdCodigoBarras = new JTextField();
        jLabel7 = new JLabel();
        jLabel5 = new JLabel();
        btnVoltar = new JButton();
        btnConfirmar = new JButton();
        tfdValor = new JTextField();
        jLabel3 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Pagamento.setFont(new Font("Segoe UI", 1, 18)); // NOI18N
        Pagamento.setText("Pagamento");
        getContentPane().add(Pagamento);
        Pagamento.setBounds(390, 30, 110, 25);
        Pagamento.getAccessibleContext().setAccessibleName("Pagamento");

        getContentPane().add(canvas1);
        canvas1.setBounds(678, 209, 0, 0);

        jPanelBoleto.setBorder(BorderFactory.createTitledBorder("Boleto"));

        tfdValor.setEditable(false);
        tfdValor.setText(precoFinal);

        jLabel2.setText("Código de Barras");

        tfdCodigoBarras1.setEditable(false);
        tfdCodigoBarras1.setBackground(new Color(255, 255, 255));
        tfdCodigoBarras1.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));

        GroupLayout jPanelBoletoLayout = new GroupLayout(jPanelBoleto);
        jPanelBoleto.setLayout(jPanelBoletoLayout);
        jPanelBoletoLayout.setHorizontalGroup(
            jPanelBoletoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoletoLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel2)
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(jPanelBoletoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBoletoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tfdCodigoBarras1)
                    .addContainerGap()))
        );
        jPanelBoletoLayout.setVerticalGroup(
            jPanelBoletoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoletoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(jPanelBoletoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanelBoletoLayout.createSequentialGroup()
                    .addContainerGap(64, Short.MAX_VALUE)
                    .addComponent(tfdCodigoBarras1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49)))
        );

        getContentPane().add(jPanelBoleto);
        jPanelBoleto.setBounds(30, 310, 400, 170);
        jPanelBoleto.getAccessibleContext().setAccessibleName("Boleto");

        tiposPagamento.setModel(new DefaultComboBoxModel<>(new String[] { "Cartão", "Boleto", "Pix" }));
        tiposPagamento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                tiposPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(tiposPagamento);
        tiposPagamento.setBounds(30, 90, 250, 22);

        jPanelCartao.setBorder(BorderFactory.createTitledBorder("Cartão"));
        jPanelCartao.setLayout(null);

        tfdNome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                tfdNomeActionPerformed(evt);
            }
        });
        jPanelCartao.add(tfdNome);
        tfdNome.setBounds(28, 48, 769, 22);
        jPanelCartao.add(tfdNumeroCartao);
        tfdNumeroCartao.setBounds(30, 110, 285, 22);
        jPanelCartao.add(tfdValidade);
        tfdValidade.setBounds(390, 110, 163, 22);

        jLabel1.setText("Nome do titular");
        jPanelCartao.add(jLabel1);
        jLabel1.setBounds(28, 26, 84, 16);

        jLabel4.setText("Validade (DD/MM/AAAA)");
        jPanelCartao.add(jLabel4);
        jLabel4.setBounds(390, 90, 136, 20);

        jLabel6.setText("Número do cartão");
        jPanelCartao.add(jLabel6);
        jLabel6.setBounds(30, 90, 97, 16);
        jPanelCartao.add(tfdCVV1);
        tfdCVV1.setBounds(660, 110, 137, 22);

        jLabel8.setText("CVC");
        jPanelCartao.add(jLabel8);
        jLabel8.setBounds(660, 90, 136, 20);

        getContentPane().add(jPanelCartao);
        jPanelCartao.setBounds(30, 130, 840, 170);

        jPanelPix.setBorder(BorderFactory.createTitledBorder("PIX"));

        tfdCodigoBarras.setEditable(false);
        tfdCodigoBarras.setBackground(new Color(255, 255, 255));
        tfdCodigoBarras.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel7.setText("Copia e Cola");

        GroupLayout jPanelPixLayout = new GroupLayout(jPanelPix);
        jPanelPix.setLayout(jPanelPixLayout);
        jPanelPixLayout.setHorizontalGroup(
            jPanelPixLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPixLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfdCodigoBarras)
                .addContainerGap())
            .addGroup(jPanelPixLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel7)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanelPixLayout.setVerticalGroup(
            jPanelPixLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanelPixLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfdCodigoBarras, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanelPix);
        jPanelPix.setBounds(460, 310, 410, 170);
        jPanelPix.getAccessibleContext().setAccessibleName("PIX");

        jLabel5.setText("Selecione o tipo de pagamento");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 70, 210, 16);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(630, 500, 110, 23);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    btnConfirmarActionPerformed(evt);
                } catch (CartaoException e) {
                    JOptionPane.showMessageDialog(null,e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                } catch (DataException e){
                    JOptionPane.showMessageDialog(null,e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        getContentPane().add(btnConfirmar);
        btnConfirmar.setBounds(755, 500, 110, 23);

        tfdValor.setBackground(new Color(255, 255, 255));
        tfdValor.setDisabledTextColor(new Color(255, 0, 0));
        getContentPane().add(tfdValor);
        tfdValor.setBounds(730, 90, 137, 22);

        jLabel3.setText("Valor da Compra");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(730, 70, 136, 20);

        pack();
    }// </editor-fold>                        

    private void tiposPagamentoActionPerformed(ActionEvent evt) {                                               
        String item = (String) tiposPagamento.getSelectedItem();
        if(item.equals("Boleto")){

            tfdNome.setEditable(false);
            tfdNumeroCartao.setEditable(false);
            tfdCVV1.setEditable(false);
            tfdValidade.setEditable(false);
            String codigoBarras = "26090.20819 96123.397737 55900.000005 3 94220000010000 ";
            tfdCodigoBarras.setText("");
            tfdCodigoBarras1.setText(codigoBarras);
            
        } 
        else if (item.equals("Pix")){

            Random rand = new Random();
            int num = rand.nextInt(100000, 45000000);
            
            tfdNome.setEditable(false);
            tfdNumeroCartao.setEditable(false);
            tfdCVV1.setEditable(false);
            tfdValidade.setEditable(false);
            String chavePix = "00020126330014br.gov.bcb-" + "CINESHOW" + tfdValor.getText() +  num;
            tfdCodigoBarras1.setText("");
            tfdCodigoBarras.setText(chavePix);
        }
    }                                              

    private void tfdNomeActionPerformed(ActionEvent evt) {                                        
       
    }                                       

    private void btnVoltarActionPerformed(ActionEvent evt) {                                          
        this.dispose();
        TelaDeIngresso.desenha(usuario);
    }                                         

    private void btnConfirmarActionPerformed(ActionEvent evt) throws CartaoException, DataException{                                             
        String item = (String) tiposPagamento.getSelectedItem();

        if(item.equals("Cartão")){
            if(tfdNome.getText().isEmpty() || tfdNumeroCartao.getText().isEmpty() || tfdCVV1.getText().isEmpty() || tfdValidade.getText().isEmpty() || tfdValor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Preencha todos os campos para realizar o pagamento","Erro",JOptionPane.ERROR_MESSAGE);
            }
            else{
                int cvc;
                try{
                    cvc = Integer.parseInt(tfdCVV1.getText());   
                }catch(NumberFormatException e){
                    throw new CartaoException("Cartão com CVC inválido!");
                }
                String nomeTitular = tfdNome.getText();
                String numeroCartao = tfdNumeroCartao.getText();
                String validade = tfdValidade.getText();
                double valor = Double.parseDouble(tfdValor.getText()); 

                CartaoPagamento cartao = new CartaoPagamento(numeroCartao, nomeTitular, validade, cvc);
                if(!CartaoPagamento.validarNumeroCartao(numeroCartao)){
                    throw new CartaoException("Cartão com número inválido!");
                }

                if(tfdCVV1.getText().length() != 3 && cvc > 999){
                    throw new CartaoException("Cartão com CVC inválido!");
                }
                try {
                    Data.parser(validade);
                } catch (DataException e) {
                    throw new DataException();
                }
                if(CartaoPagamento.validarCartao(cartao) == true){
                    PagamentoCartao pagarComCartao = new PagamentoCartao(valor, cartao);
                    pagarComCartao.efetuarPagamento();
                    JOptionPane.showMessageDialog(null,"Pagamento Confirmado no valor de " + tfdValor.getText() + " reais para " + tfdNome.getText() + ".","Sucesso",JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Não foi possível efetuar a compra. Revise seus dados e tente novamente","Falha na solicitação",JOptionPane.ERROR_MESSAGE);
                }
                this.dispose();
                TelaDeIngresso.desenha(usuario);
            }
            
        } 
        else if(item.equals("Boleto")){
            JOptionPane.showMessageDialog(null,"Boleto gerado!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } 
        else if(item.equals("Pix")) {
            JOptionPane.showMessageDialog(null,"Pix Copia e Cola gerado!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null,"Selecione a forma de pagamento","Erro",JOptionPane.ERROR_MESSAGE);

    }
    
    
    public static void desenha (String user, String preco){
        usuario = user;
        precoFinal = preco;
        TelaDePagamento telaIngresso = new TelaDePagamento();
        int width = 900;
        int height = 570;
        telaIngresso.setSize(width, height);
        telaIngresso.setLocationRelativeTo(null);
        telaIngresso.setResizable(false);
        telaIngresso.setVisible(true);

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
            java.util.logging.Logger.getLogger(TelaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaDePagamento.desenha(usuario, precoFinal);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JLabel Pagamento;
    private JButton btnConfirmar;
    private JButton btnVoltar;
    private Canvas canvas1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JPanel jPanelBoleto;
    private JPanel jPanelCartao;
    private JPanel jPanelPix;
    private JTextField tfdCVV1;
    private JTextField tfdCodigoBarras;
    private JTextField tfdCodigoBarras1;
    private JTextField tfdNome;
    private JTextField tfdNumeroCartao;
    private JTextField tfdValidade;
    private JTextField tfdValor;
    private JComboBox<String> tiposPagamento;
    private static String usuario;
    public static String precoFinal;
    // End of variables declaration                   
}
