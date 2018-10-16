package com.vertex.patterns.decorator;

import com.vertex.patterns.factory.cars.AbstractCar;

public class CarDecoratorPlus extends CarDecorator {

    private AbstractCar car;

    public CarDecoratorPlus(AbstractCar car) {
        super(car);
    }

    public void fastDrivePlus() {

        System.out.print("Very fast \"+\" ");
        fastDrive();

    }
}
