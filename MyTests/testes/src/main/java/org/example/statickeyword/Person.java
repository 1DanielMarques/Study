package org.example.statickeyword;

public class Person {

    static int cont;

    public Person() {
        this.cont += 1;
    }

    public static int getCont() {
        return cont;
    }

}

