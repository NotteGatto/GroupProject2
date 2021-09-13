package com.company.GroupProject.Task1;
// Create an Interface 'Shape' with undefined methods as calculateArea and calculate Perimeter.
// Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.

public interface Shape {
    void calculateArea(int a);
    void calculatePerimeter(int p);}

class Circle implements Shape {
    @Override
    public void calculateArea(int a) {
        System.out.println("The area of circle with radius "+a+" is equal to: "+ Math.PI*Math.pow(a,2));}

    @Override
    public void calculatePerimeter(int p) {
        System.out.println("The perimeter of circle with radius "+p+" is equal to: "+ 2*Math.PI*p);}}

class Square implements Shape {
    @Override
    public void calculateArea(int a) {
        System.out.println("The area of square with side "+a+" is equal to: "+Math.pow(a,2));}

    @Override
    public void calculatePerimeter(int p) {
        System.out.println("The perimeter of square with side "+p+" is equal to: "+ 4*p);}}
