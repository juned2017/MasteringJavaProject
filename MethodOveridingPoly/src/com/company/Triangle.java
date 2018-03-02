package com.company;

public class Triangle extends Figure {

    int cornerSize;

    Triangle(double a, double b, int cornerSize) {
        super(a, b);
        this.cornerSize=cornerSize;
    }

    @Override
    double area() {
        System.out.println("Inside Area of Triangle is");
        return dim1*dim2/2;
    }
}
