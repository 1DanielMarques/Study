package org.example.core.abstractfactory.factories;

import org.example.core.abstractfactory.products.Chair;
import org.example.core.abstractfactory.products.ModernChair;
import org.example.core.abstractfactory.products.ModernSofa;
import org.example.core.abstractfactory.products.Sofa;

public class ModernFactory implements AbstractFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
