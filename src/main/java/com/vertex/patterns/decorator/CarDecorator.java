package com.vertex.patterns.decorator;

import com.vertex.patterns.factory.cars.AbstractCar;
import com.vertex.patterns.factory.cars.Car;

public class CarDecorator implements Car {

    private AbstractCar car;

    public CarDecorator(AbstractCar car) {
        this.car = car;
    }

    public void fastDrive() {
        System.out.print("Very fast ");
        drive();
    }


    @Override
    public void drive() {
        car.drive();
    }

    @Override
    public void stop() {
        car.stop();
    }
}
