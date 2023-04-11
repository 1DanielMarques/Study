package org.example.core.abstractfactory.products;

public class ClassicChair implements Chair {
    @Override
    public void print() {
        System.out.println("Classic Chair");
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
