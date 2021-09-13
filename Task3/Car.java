package com.company.GroupProject.Task3;

/* Create a Class Car that would have the following  fields: carPrice and color and method calculateSalePrice()
which should be returning a price of the car. Create 2 subclasses: Sedan and Truck.
The Truck class has a field as weight and has its own implementation of calculateSalePrice() method in which
returned price calculated as following: if weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.The Sedan class has a field as length and also does its own implementation of calculateSalePrice():
 if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount */

public abstract class Car {
    double carPrice;
    String color;
    abstract void calculateSalePrice();}

class Sedan extends Car {
    double length;

    Sedan(double length, double carPrice) {
        this.length = length;
        this.carPrice = carPrice;}
    @Override
    void calculateSalePrice() {
        double discount;
        if (length > 20) { discount = 0.05;
        } else { discount = 0.1;}
        System.out.println("The price of Sedan is: " + "$" + carPrice + " with the length of: " + length +
                "feet," + " based on discount rate: "+discount*100+"%, " + "total price is: " + "$" + (carPrice - (carPrice * discount)));
    }
}
class Truck extends Car {
    double weight;

    Truck(double weight,double carPrice) {
        this.weight=weight;
        this.carPrice = carPrice;}

    @Override
    void calculateSalePrice() {double discount;
        if(weight>2000) {discount = 0.1;
        } else {discount = 0.2;}
        System.out.println("The price of Truck is: " + "$" + carPrice + " with the weight of: " + weight +
                "lbs" + " based on discount rate: "+discount*100+"%, " + "total price is: " + "$" + (carPrice - (carPrice * discount)));
    }}