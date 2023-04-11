package org.example.core.abstractfactory.products;


public class ModernSofa implements Sofa {

    @Override
    public void print() {
        System.out.println("Modern Sofa");
    }

    @Override
    public boolean hasCushion() {
        return true;
    }
}
