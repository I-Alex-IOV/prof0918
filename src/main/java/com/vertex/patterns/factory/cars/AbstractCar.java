package com.vertex.patterns.factory.cars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractCar implements Car {
    private double driveAcceleration;
    private double breakAcceleration;
    private int horsePowers;
    private int weight;
    private int maxSpeed;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "driveAcceleration=" + driveAcceleration +
                ", breakAcceleration=" + breakAcceleration +
                ", horsePowers=" + horsePowers +
                ", weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
