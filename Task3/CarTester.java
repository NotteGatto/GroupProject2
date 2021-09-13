package com.company.GroupProject.Task3;

public class CarTester {
    public static void main(String[] args) {

        Car carS = new Sedan(13.5,28000);
        carS.calculateSalePrice();

        Car carS1 = new Sedan(23,32000);
        carS1.calculateSalePrice();

        Car carT = new Truck(5700,58000);
        carT.calculateSalePrice();

        Car carT1 = new Truck(1950,28000);
        carT1.calculateSalePrice();

    }
}
