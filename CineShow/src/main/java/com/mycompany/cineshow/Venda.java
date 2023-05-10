package com.mycompany.cineshow;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Ingresso> ingressos;
    private Cliente cliente;

    public Venda(Cliente cliente) {
        this.ingressos = new ArrayList<>();
        this.cliente = cliente;
    }

    public void addIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotalVenda() {
        double total = 0;
        for (Ingresso ingresso : ingressos) {
            total += ingresso.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Vendas{" +
                "ingressos=" + ingressos +
                ", cliente=" + cliente +
                '}';
    }
}
