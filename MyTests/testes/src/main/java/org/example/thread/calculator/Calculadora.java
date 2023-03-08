package org.example.thread.calculator;

public class Calculadora {

    private int soma;

    public synchronized int somaArray(int[] array) {
        this.soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
            System.out.println("Executando a soma " + Thread.currentThread().getName() + " somando " + array[i] + " total " + soma);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return this.soma;
    }

}
