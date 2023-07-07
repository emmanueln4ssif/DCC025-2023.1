/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package com.mycompany.cineshow;

public class IngressoInteiro extends Ingresso {

  public IngressoInteiro(Filme filme, double preco) {
    super(filme, preco);
    this.setTipo("Inteiro");
  }

  public double calculaPreco() {
    return getPreco();
  }
}
