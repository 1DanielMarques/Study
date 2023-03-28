package org.example.core.abstractfactory.factories;

import org.example.core.abstractfactory.products.Chair;
import org.example.core.abstractfactory.products.RetroChair;
import org.example.core.abstractfactory.products.RetroSofa;
import org.example.core.abstractfactory.products.Sofa;

public class RetroFactory implements AbstractFactory{
    @Override
    public Chair createChair() {
        System.out.println("Retro Chair");
        return new RetroChair();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Retro Sofa");
        return new RetroSofa();
    }
}
