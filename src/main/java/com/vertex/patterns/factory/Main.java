package com.vertex.patterns.factory;

import com.vertex.patterns.factory.cars.CarType;

import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {
        EnumSet.allOf(CarType.class)
                .stream()
                .map(CarFactory::getCar)
                .forEach(car -> {
                    car.drive();
                    car.stop();
                });
    }
}
