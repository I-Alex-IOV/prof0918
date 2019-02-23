package com.vertex.enums;

import java.util.Arrays;

public class EnumsExperiments {

    public static void main(String[] args) {
        Arrays.stream(Planets.values())
                .forEach(System.out::println);
    }
}

enum Planets {
    MERCURY(2.4397e6) {
        public double getWeight() {
            return 3.303e+23;
        }
    }, VENUS(6.0518e6) {
        public double getWeight() {
            return 3.303e+23;
        }
    }, EARTH(6.37814e6) {
        public double getWeight() {
            return 3.303e+23;
        }
    }, MARS(3.3972e6) {
        public double getWeight() {
            return 3.303e+23;
        }
    }, JUPITER(7.1492e7) {
        public double getWeight() {
            return 3.303e+23;
        }
    }, SATURN(6.0268e7) {
        public double getWeight() {
            return 3.303e+23;
        }
    }, PLUTO(1.1883e3) {
        public double getWeight() {
            return 3.303e+23;
        }
    }, URANUS(2.5559e7) {
        public double getWeight() {
            return 3.303e+23;
        }
    };

    private double radius;

    Planets(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    abstract double getWeight();

    @Override
    public String toString() {
        return name() + ", radius: " + radius;
    }
}
