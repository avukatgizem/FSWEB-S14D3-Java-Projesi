package com.workintech.polymorfism.pasific;

import com.workintech.polymorfism.pasific.Holden;

public class Main {

    public static void main(String[] args) {


        com.workintech.polymorphism.pacific.Car car = new com.workintech.polymorphism.pacific.Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        com.workintech.polymorphism.pacific.Car mitsubishi = new com.workintech.polymorphism.pacific.Car(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        com.workintech.polymorphism.pacific.Car ford = new com.workintech.polymorphism.pacific.Car(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        com.workintech.polymorphism.pacific.Car holden = new com.workintech.polymorphism.pacific.Car(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());
    }

}