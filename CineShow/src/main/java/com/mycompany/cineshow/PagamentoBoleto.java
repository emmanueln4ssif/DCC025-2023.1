package com.mycompany.cineshow;

public class PagamentoBoleto extends Pagamento {

    private Cliente cliente;
    private Cinema cinema;

    public PagamentoBoleto(double valor, Cliente cliente, Cinema cinema) {
        super(valor);
        this.cliente = cliente;
        this.cinema = cinema;
    }

    @Override
    public boolean efetuarPagamento() {
        String codigoBarras = "26090.20819 96123.397737 55900.000005 3 94220000010000 " + this.cliente.getCpf() + this.cinema.getNome() + getValor();
        System.out.println("Aqui esta o codigo do seu boleto para pagamento" + codigoBarras);
        System.out.println("Copie e cole no aplicativo do seu banco ");
        
        
        // new Timer().schedule(new TimerTask() {
        // @Override
        //     public void run() {
        //         System.out.println("pagamento efectuado com sucesso");
        //     }
        // }, 3000L);
        
        return true;
    }
}
