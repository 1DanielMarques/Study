package org.example.record;

public record Rectangle(double width, double length) {

    public Rectangle(double width, double length){
        this.width = 1;
        this.length = 1;
    }
}
