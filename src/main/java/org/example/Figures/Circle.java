package org.example.Figures;

public class Circle {
    int radius;
    final double pi=3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double computeArea(){
        return pi*radius*radius;
    }

    public double computePerimeter(){
        return 2*pi*radius;
    }
}
