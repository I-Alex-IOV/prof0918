package com.vertex.patterns.factory;

import com.vertex.patterns.factory.cars.Car;
import com.vertex.patterns.factory.cars.CarType;

public class CarFactory {

    public static Car getCar(CarType carType){
        return carType.buildCar();
    }
}
