package org.example.core.abstractfactory.factories;

import org.example.core.abstractfactory.products.Chair;
import org.example.core.abstractfactory.products.ClassicChair;
import org.example.core.abstractfactory.products.ClassicSofa;
import org.example.core.abstractfactory.products.Sofa;

public class ClassicFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }
}
