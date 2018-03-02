package com.company;

public class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Area for Rectangle is");
        return dim1*dim2;
    }
}
