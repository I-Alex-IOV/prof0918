package com.vertex.patterns.decorator;

import com.vertex.patterns.factory.CarFactory;
import com.vertex.patterns.factory.cars.CarType;

public class Main {

    public static void main(String[] args) {
        CarDecorator carDecorator = new CarDecorator(CarFactory.getCar(CarType.TOYOTA_COROLA));

        carDecorator.fastDrive();
    }
}
