package org.example.testes2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

        var car = new Car();
        car.setAge(18);

        Field field = car.getClass().getDeclaredField("age");
        if(field.isAnnotationPresent(GreaterThan18.class)) {
            if(car.getAge() > 18){
                System.out.println("OK");
            }else {
                System.out.printf("NOT OK");
            }
        };

    }
}