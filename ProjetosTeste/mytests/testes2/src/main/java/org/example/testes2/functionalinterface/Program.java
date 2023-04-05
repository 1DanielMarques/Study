package org.example.testes2.functionalinterface;

public class Program {
    public static void main(String[] args) {
        method(() -> "Hello");
    }

    static void method(MyInterface myInterface) {
        System.out.println(myInterface.myMethod());
    }

}
