package org.example.testes.thread.calculator;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        MinhaThreadSoma t1 = new MinhaThreadSoma("#1", nums);
        MinhaThreadSoma t2 = new MinhaThreadSoma("#2", nums);
    }
}