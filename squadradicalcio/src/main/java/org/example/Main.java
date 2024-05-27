package org.example;

public class Main {
    public static void main(String[] args) {
        Squadra squadra = new Squadra("as sai soccer");

        Giocatore giocatore1 = new Giocatore("Lionel Pessi", 10);
        Giocatore giocatore2 = new Giocatore("Cristiano Penaldo", 7);

        squadra.aggiungiGiocatore(giocatore1);
        squadra.aggiungiGiocatore(giocatore2);

        System.out.println("Dati della squadra:");
        System.out.println(squadra);

        System.out.println("\nLista dei giocatori:");
        for (Giocatore giocatore : squadra.getGiocatori()) {
            System.out.println(giocatore);
        }
    }
}
