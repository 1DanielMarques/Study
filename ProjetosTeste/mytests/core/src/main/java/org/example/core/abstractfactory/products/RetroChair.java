package org.example.core.abstractfactory.products;

public class RetroChair implements Chair{

    @Override
    public void print() {
        System.out.println("Retro Chair");
    }
    @Override
    public boolean hasLegs() {
        return true;
    }
}
