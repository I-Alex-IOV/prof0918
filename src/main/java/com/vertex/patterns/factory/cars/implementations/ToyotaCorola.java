package com.vertex.patterns.factory.cars.implementations;

import com.vertex.patterns.factory.cars.AbstractCar;

public class ToyotaCorola extends AbstractCar {

    public ToyotaCorola(double driveAcceleration, double breakAcceleration, int horsePowers, int weight, int maxSpeed) {
        super(driveAcceleration, breakAcceleration, horsePowers, weight, maxSpeed);
    }

    @Override
    public void drive() {
        System.out.println("Driving Toyota Corola " + this);
    }

    @Override
    public void stop() {
        System.out.println("Stopping Toyota Corola " + this);
    }


}
