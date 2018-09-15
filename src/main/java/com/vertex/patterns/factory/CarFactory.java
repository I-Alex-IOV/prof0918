package com.vertex.patterns.factory;

import com.vertex.patterns.factory.cars.AbstractCar;
import com.vertex.patterns.factory.cars.CarType;

public class CarFactory {

    public static AbstractCar getCar(CarType carType) {
        return carType.buildCar();
    }
}
