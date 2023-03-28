package org.example.core.abstractfactory.products;



public class ModernChair implements Chair {
    @Override
    public void print() {
        System.out.println("Modern Chair");
    }
    @Override
    public boolean hasLegs() {
        return true;
    }
}
