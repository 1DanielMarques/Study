package org.example.core.abstractfactory;

import org.example.core.abstractfactory.factories.AbstractFactory;
import org.example.core.abstractfactory.factories.ClassicFactory;
import org.example.core.abstractfactory.factories.ModernFactory;
import org.example.core.abstractfactory.factories.RetroFactory;
import org.example.core.abstractfactory.products.Chair;
import org.example.core.abstractfactory.products.Sofa;

public class Program {

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
        var factory = createFactory(3);
        Chair chair = factory.createChair();
        chair.print();
        System.out.println("Has legs: " + chair.hasLegs());
        Sofa sofa = factory.createSofa();
        sofa.print();
        System.out.println("Has cushions: "+sofa.hasCushion());



    }
}
