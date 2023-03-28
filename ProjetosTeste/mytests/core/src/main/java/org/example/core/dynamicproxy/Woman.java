package org.example.core.dynamicproxy;

import lombok.Data;

@Data
public class Woman implements Person{

    private String name;

    @Override
    public void introduce(String name) {
        System.out.println("I'm a woman called "+this.name);
    }

    @Override
    public void sayAge(int age) {

    }

    @Override
    public void sayWhereFrom(String city, String country) {

    }

}
