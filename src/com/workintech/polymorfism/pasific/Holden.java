package com.workintech.polymorfism.pasific;

public class Holden extends com.workintech.polymorphism.pacific.Car {
    public Holden(int cylinders, String name) {
        super();
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return getName() + " engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName() + " is accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return getName() + " is braking";
    }
}