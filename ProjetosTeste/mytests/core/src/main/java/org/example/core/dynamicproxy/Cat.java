package org.example.core.dynamicproxy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Cat implements Animal{
    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }
}
