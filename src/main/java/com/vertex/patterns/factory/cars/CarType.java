package com.vertex.patterns.factory.cars;

import com.vertex.patterns.factory.cars.implementations.BmwE28;
import com.vertex.patterns.factory.cars.implementations.MercedesG;
import com.vertex.patterns.factory.cars.implementations.ToyotaCorola;

public enum CarType {

    MERCEDES_G{
        @Override
        public AbstractCar buildCar() {
            return new MercedesG(10.0, 15.0, 500, 2000, 280);
        }
    }, TOYOTA_COROLA {
        @Override
        public AbstractCar buildCar() {
            return new ToyotaCorola(6.0, 6.5, 140, 1200, 220);
        }
    }, BMW_E28 {
        @Override
        public AbstractCar buildCar() {
            return new BmwE28(6.0, 6.5, 200, 1500, 250);
        }
    };


    public abstract AbstractCar buildCar();


}
