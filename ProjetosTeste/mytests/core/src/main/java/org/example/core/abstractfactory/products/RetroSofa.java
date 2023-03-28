package org.example.core.abstractfactory.products;


public class RetroSofa implements Sofa {

    @Override
    public void print() {
        System.out.println("Retro Sofa");
    }

    @Override
    public boolean hasCushion() {
        return true;
    }
}
