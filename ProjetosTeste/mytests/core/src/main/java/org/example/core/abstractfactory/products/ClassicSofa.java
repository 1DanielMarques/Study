package org.example.core.abstractfactory.products;

public class ClassicSofa implements Sofa {

    @Override
    public void print() {
        System.out.println("Classic Sofa");
    }

    public boolean hasCushion() {
        return false;
    }
}
