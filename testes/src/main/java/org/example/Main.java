package org.example;

public class Main {
    public static void main(String[] args) {
      int valor = 10;
      Pessoa pessoa = new Pessoa("Daniel");
        System.out.println(valor);
        System.out.println(pessoa.getNome());
        System.out.println("----------------");
        teste1(valor,pessoa);
        System.out.println(valor);
        System.out.println(pessoa.getNome());
        System.out.println("----------------");
        teste2(valor,pessoa);
        System.out.println(valor);
        System.out.println(pessoa.getNome());
        teste3(valor);
        System.out.println(valor);
    }

    public static void teste1(int valor, Pessoa pessoa){
        int novoValor = valor + 10;
        valor = novoValor;
        pessoa = new Pessoa("Joao");
    }

    public static void teste2(int valor, Pessoa pessoa){
        int novoValor = valor + 10;
        valor = novoValor;
        pessoa.setNome("Joao");
    }

    public static void teste3(int valor){
        valor = 50;
    }


}