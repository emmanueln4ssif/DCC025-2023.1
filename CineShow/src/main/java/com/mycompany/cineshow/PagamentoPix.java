/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package com.mycompany.cineshow;

public class PagamentoPix extends Pagamento {

    private Cliente cliente;
    private Cinema cinema;

    public PagamentoPix(double valor, Cliente cliente, Cinema cinema) {
        super(valor);
        this.cliente = cliente;
        this.cinema = cinema;
    }

    @Override
    public boolean efetuarPagamento() {
        String ChavePix = "00020126330014br.gov.bcb-" + this.cliente.getCpf() + this.cinema.getNome() + getValor();
        System.out.println("Aqui esta o codigo pix para pagamento do seu engresso" + ChavePix);
        System.out.println("Copie e cola no aplicatio do seu banco para efectuar o pagamento");
        
        
        // new Timer().schedule(new TimerTask() {
        // @Override
        //     public void run() {
        //         System.out.println("pagamento efectuado com sucesso");
        //     }
        // }, 3000L);
        
        
        return true;
    }
}