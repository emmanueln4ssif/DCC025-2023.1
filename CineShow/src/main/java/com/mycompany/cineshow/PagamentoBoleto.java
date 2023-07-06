package com.mycompany.cineshow;

import java.util.*;

public class PagamentoBoleto extends Pagamento {

    private String codigo;

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public boolean efetuarPagamento() {

        String codigoBarras = "26090.20819 96123.397737 55900.000005 3 94220000010000 " + getValor();
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
