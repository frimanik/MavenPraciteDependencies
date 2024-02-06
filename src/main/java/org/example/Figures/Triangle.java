package org.example.Figures;

public class Triangle {

    double a,b,c,height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    public double computeArea(){
        return (a * height)/2;
    }

    public double computePerimeter (){
        return a+b+c;
    }
}
