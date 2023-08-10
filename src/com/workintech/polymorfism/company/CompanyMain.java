package com.workintech.polymorfism.company;

import com.workintech.polymorphism.skeleton.CarSkeleton;

public class CompanyMain {

    public static void main(String[] args) {
        CarSkeleton car1 = new com.workintech.polymorphism.company.ElectricCar("Tesla", "Tesla aracıdır", 100, 10);
        CarSkeleton car2 = new com.workintech.polymorphism.company.GasPoweredCar("Mercedes", "c180", 0.08, 4);
        car1.drive();
        car2.drive();


    }

}