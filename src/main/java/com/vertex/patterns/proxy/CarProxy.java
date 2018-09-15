package com.vertex.patterns.proxy;

import com.vertex.patterns.factory.cars.Car;

public class CarProxy implements Car {

    Car delegate;

    public CarProxy(Car delegate) {
        this.delegate = delegate;
    }


    @Override
    public void drive() {
        System.out.println("Oh no, he is pushing the acceleration pedal");
        delegate.drive();
    }

    @Override
    public void stop() {
        System.out.println("Stop, stop, stop, oops =)");
        delegate.stop();
    }
}
