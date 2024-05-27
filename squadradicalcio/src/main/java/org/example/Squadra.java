package org.example;

import java.util.ArrayList;
import java.util.List;

public class Squadra {
    private String nome;
    private List<Giocatore> giocatori;

    public Squadra(String nome) {
        this.nome = nome;
        this.giocatori = new ArrayList<>();
    }

    public void aggiungiGiocatore(Giocatore giocatore) {
        giocatori.add(giocatore);
    }

    public List<Giocatore> getGiocatori() {
        return giocatori;
    }

    @Override
    public String toString() {
        return "Squadra{" +
                "nome='" + nome + '\'' +
                ", giocatori=" + giocatori +
                '}';
    }
}
