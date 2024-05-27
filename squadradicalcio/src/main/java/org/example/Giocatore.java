package org.example;

public class Giocatore {
    private String nome;
    private int numeroMaglia;

    public Giocatore(String nome, int numeroMaglia) {
        this.nome = nome;
        this.numeroMaglia = numeroMaglia;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMaglia() {
        return numeroMaglia;
    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "nome='" + nome + '\'' +
                ", numeroMaglia=" + numeroMaglia +
                '}';
    }
}
