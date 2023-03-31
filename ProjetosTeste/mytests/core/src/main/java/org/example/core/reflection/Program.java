package org.example.core.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Program {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("Stella", 6);
        Field[] fields = myCat.getClass().getDeclaredFields();
        // System.out.println(myCat.getName());

      /*  for (Field field : fields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "Fred");
                System.out.println(myCat.getName());
            }
        } */

        Method[] methods = myCat.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals("thisIsAPrivateStaticMethod")) {
                method.setAccessible(true);
                method.invoke(null);
            }
        }


    }

}
