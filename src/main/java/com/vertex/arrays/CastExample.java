package com.vertex.arrays;

import com.vertex.patterns.factory.cars.AbstractCar;
import com.vertex.patterns.factory.cars.implementations.BmwE28;
import com.vertex.patterns.factory.cars.implementations.MercedesG;
import com.vertex.patterns.factory.cars.implementations.ToyotaCorola;

public class CastExample {

    public static void main(String[] args) {
        AbstractCar[] cars = new AbstractCar[]{
                new BmwE28(2.0, 2.0, 200, 2000, 200),
                new MercedesG(2.0, 2.0, 500, 2000, 300),
                new ToyotaCorola(2.0, 2.0, 200, 2000, 200)
        };

        ((BmwE28) cars[0]).atractsGirls();
        ((MercedesG) cars[1]).scaresPeople();
    }
}
