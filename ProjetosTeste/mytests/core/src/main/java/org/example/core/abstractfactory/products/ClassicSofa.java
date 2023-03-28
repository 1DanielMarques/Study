package org.example.core.abstractfactory.products;

public class ClassicSofa implements Sofa {

    @Override
    public void print() {
        System.out.println("Classic Sofa");
    }

    @Override
    public boolean hasCushion() {
        return false;
    }
}
