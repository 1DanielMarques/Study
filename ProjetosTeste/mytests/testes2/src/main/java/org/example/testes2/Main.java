package org.example.testes2;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

        /*var car = new Car();
        car.setAge(18);

        Field field = car.getClass().getDeclaredField("age");
        if (field.isAnnotationPresent(GreaterThan18.class)) {
            if (car.getAge() > 18) {
                System.out.println("OK");
            } else {
                System.out.printf("NOT OK");
            }
        }*/
        MyInterface myInterface = (id) -> {
            var sum = 2+id;
            return sum;
        };
        System.out.println(myInterface.findById(20));
        MyInterface myClass = new MyClass();
        System.out.println(myClass.findById(20));
    }

    static class MyClass implements MyInterface {
        @Override
        public Integer findById(Integer id) {
            var sum = 2+id;
            return sum;
        }
    }

    @FunctionalInterface
    public interface MyInterface {
        Integer findById(Integer id);

        default void defaultMethod(Integer num) {
            System.out.println("Default method -> num = " + num);
        }

    }

}