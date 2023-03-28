package org.example.core.model;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
       Person person = new Person("Daniel");

      for(Field field : person.getClass().getDeclaredFields()){
          if(field.isAnnotationPresent(ValidName.class)) System.out.println(field.get(person));
      }

    }
}