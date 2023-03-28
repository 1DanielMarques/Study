package org.example.core.factorymethod;

public class ChairCreator extends Creator {
    @Override
    Mobile createMobile() {
        return new Chair();
    }
}
