package org.example.testes2;

import lombok.Data;

@Data
public class Car {

    @GreaterThan18
    private int age;

}
