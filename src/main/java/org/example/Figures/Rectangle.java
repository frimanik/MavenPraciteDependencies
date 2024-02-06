package org.example.Figures;

public class Rectangle {

    double height, width;

    public Rectangle(double height, double width) {
        this.width = width;
        this.height = height;
    }

    public double computeArea(){
        return height*width;
    }

    public double computePerimeter(){
        return (height+width)*2;
    }
}
