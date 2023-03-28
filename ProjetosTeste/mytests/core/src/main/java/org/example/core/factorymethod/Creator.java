package org.example.core.factorymethod;

public abstract class Creator {
    //Nao encontrei um nome melhor
    abstract Mobile createMobile();

    void doSomething() {
        var mobile = createMobile();
        mobile.print();
    }

}
