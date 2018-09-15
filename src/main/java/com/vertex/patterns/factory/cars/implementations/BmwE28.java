package com.vertex.patterns.factory.cars.implementations;

import com.vertex.patterns.factory.cars.AbstractCar;

public class BmwE28 extends AbstractCar {

    public BmwE28(double driveAcceleration, double breakAcceleration, int horsePowers, int weight, int maxSpeed) {
        super(driveAcceleration, breakAcceleration, horsePowers, weight, maxSpeed);
    }

    @Override
    public void drive() {
        System.out.println("Driving Shark " + this);
    }

    @Override
    public void stop() {
        System.out.println("Stopping Shark " + this);
    }
}
