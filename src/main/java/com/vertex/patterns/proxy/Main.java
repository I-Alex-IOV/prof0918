package com.vertex.patterns.proxy;

import com.vertex.patterns.factory.CarFactory;
import com.vertex.patterns.factory.cars.Car;
import com.vertex.patterns.factory.cars.CarType;

public class Main {
    public static void main(String[] args) {
        Car car = new CarProxy(CarFactory.getCar(CarType.MERCEDES_G));

        car.drive();
        car.stop();
    }
}
