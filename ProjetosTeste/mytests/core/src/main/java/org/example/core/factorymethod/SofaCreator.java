package org.example.core.factorymethod;

public class SofaCreator extends Creator{
    @Override
    Mobile createMobile() {
        return new Sofa();
    }
}
