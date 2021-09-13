package com.company.GroupProject.Task1;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculateArea(10);
        shape.calculatePerimeter(10);

        Shape shape1 = new Square();
        shape1.calculateArea(8);
        shape1.calculatePerimeter(8);
    }
}
