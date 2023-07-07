/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package com.mycompany.cineshow;

public class IngressoMeiaEntrada extends Ingresso {

  public IngressoMeiaEntrada(Filme filme, double preco) {
    super(filme, preco);
    setTipo("Meia-entrada");
  }

  public double calculaPreco() {
    return getPreco() / 2;
  }
}
