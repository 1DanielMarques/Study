package org.example.testes.thread.tique.taque;

public class Main {
    public static void main(String[] args) {
        TiqueTaque tt = new TiqueTaque();
        ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
        ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);

    }
}