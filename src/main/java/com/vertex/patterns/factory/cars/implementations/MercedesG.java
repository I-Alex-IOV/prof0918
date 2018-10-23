package com.vertex.patterns.factory.cars.implementations;

import com.vertex.patterns.factory.cars.AbstractCar;

public class MercedesG extends AbstractCar {

    public MercedesG(double driveAcceleration, double breakAcceleration, int horsePowers, int weight, int maxSpeed) {
        super(driveAcceleration, breakAcceleration, horsePowers, weight, maxSpeed);
    }

    @Override
    public void drive() {
        System.out.println("Driving Gelik " + this);
    }

    @Override
    public void stop() {
        System.out.println("Stopping Kubik " + this);
    }

    public boolean scaresPeople() {
        return true;
    }
}
