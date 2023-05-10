package com.mycompany.cineshow;
public class Assento {
    private int numero;
    private boolean ocupado;

    public Assento(int numero, boolean ocupado) {
        this.numero = numero;
        this.ocupado = ocupado;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Assento{" +
                "numero=" + numero +
                ", ocupado=" + ocupado +
                '}';
    }
}
