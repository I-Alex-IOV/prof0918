package com.vertex.Sheremet.homework2.Figures;

public class Rectangular implements Figure {

    private Square square;
    private int sideTwo;

    public Rectangular() {

    }

    public Rectangular(Square square, int sideTwo) {
        this.square = square;
        this.sideTwo = sideTwo;
    }

    public static class Builder {

        private Rectangular rectangular;

        public Builder() {
            rectangular = new Rectangular();
        }

        public Builder withPoint(Square square) {
            rectangular.square = square;
            return this;
        }

        public Builder withSide(int sideTwo) {
            rectangular.sideTwo = sideTwo;
            return this;
        }

        public Rectangular build() {
            return rectangular;
        }
    }

    public int getSideTwo() {
        return sideTwo;
    }

    @Override
    public double getArea() {
        return square.getSide() * sideTwo;
    }

    @Override
    public double getPerimeter() {
        return (square.getSide() + sideTwo) * 2;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "square=" + square +
                ", sideTwo=" + sideTwo +
                '}';
    }
}
