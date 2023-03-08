package org.example.thread.tique.taque;

public class TiqueTaque {

    synchronized void tique(boolean estaExecutando) {
        if (!estaExecutando) {
            notify();
            return;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("Tique ");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    synchronized void taque(boolean estaExecutando) {
        if (!estaExecutando) {
        notify();
            return;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Taque ");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
