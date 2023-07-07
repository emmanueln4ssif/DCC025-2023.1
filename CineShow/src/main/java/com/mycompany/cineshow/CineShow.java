/*Dayane Guimaraes Gomes Godoy - 2022265554C;
        Emmanuel Gomes Nassif - 202265555C;
        Habirou Mama - 202265563C;
        Walace Alan de Paula - 202265560C*/
package com.mycompany.cineshow;

import com.mycompany.cineshow.telas.TelaLogin;
import java.util.ArrayList;
import java.util.List;


public class CineShow {

    private static Admin administrador = new Admin("Administrador", null, "admin@cineshow.br", null, "Admin", "1234");
    private static List<Filme> filmes = new ArrayList<>();
    private static Cinema cinema = new Cinema("CineShow", "Juiz de fora", 400, administrador, null, filmes, null, null);
    // PagamentoCartao pagarComCartao = new PagamentoCartao(200, cartao);

    public static void main(String[] args) {

        TelaLogin.desenha();
    }
}
