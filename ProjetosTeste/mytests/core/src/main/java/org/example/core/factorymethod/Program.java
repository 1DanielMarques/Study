package org.example.core.factorymethod;

public class Program {

    static Creator configure(int type) {
        return switch (type) {
            case 1 -> new ChairCreator();
            case 2 -> new SofaCreator();
            default -> throw new RuntimeException();
        };
    }

    static void businessLogic() {
        creator.doSomething();
    }

    static Creator creator = configure(2);
    public static void main(String[] args) {
        businessLogic();

    }
}
