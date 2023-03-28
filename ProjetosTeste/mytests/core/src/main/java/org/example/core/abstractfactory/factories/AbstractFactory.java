package org.example.core.abstractfactory.factories;

import org.example.core.abstractfactory.products.Chair;
import org.example.core.abstractfactory.products.Sofa;

public interface AbstractFactory {

    Chair createChair();

    Sofa createSofa();

}
