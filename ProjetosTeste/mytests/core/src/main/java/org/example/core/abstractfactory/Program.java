package org.example.core.abstractfactory;

import org.example.core.abstractfactory.factories.AbstractFactory;
import org.example.core.abstractfactory.factories.ClassicFactory;
import org.example.core.abstractfactory.factories.ModernFactory;
import org.example.core.abstractfactory.factories.RetroFactory;

public class Program {

    static class Application {

        private AbstractFactory abstractFactory;

        public Application(AbstractFactory factory) {
            this.abstractFactory = factory;
        }

        public void print() {
            var chair = this.abstractFactory.createChair();
            var sofa = this.abstractFactory.createSofa();
            chair.print();
            sofa.print();
        }

    }


    public static AbstractFactory createFactory(int type) {
        //newest switch expression here
        return switch (type) {
            case 1 -> new ModernFactory();
            case 2 -> new RetroFactory();
            case 3 -> new ClassicFactory();
            default -> throw new IllegalArgumentException();
        };
    }

    public static void main(String[] args) {
        // 1 to modern
        // 2 to retro
        // 3 to classic
        // . . .
        var application = new Application(createFactory(2));
        application.print();

    }


}
