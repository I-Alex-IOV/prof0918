package com.vertex.Sheremet.homework2.Figures;

public class Oval implements Figure {

    private Circle circle;
    private int width;


    public Oval() {

    }

    public Oval(Circle circle, int width) {
        this.circle = circle;
        this.width = width;

    }

    public static class Builder {

        private Oval oval;

        public Builder() {
            oval = new Oval();
        }

        public Builder withCircle(Circle circle) {
            oval.circle = circle;
            return this;
        }

        public Builder withWidth(int width) {
            oval.width = width;
            return this;
        }

        public Oval build() {
            return oval;
        }
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return Math.PI * width * circle.getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * width * circle.getRadius();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "circle=" + circle +
                ", width=" + width +
                ", height=" + circle.getRadius() +
                '}';
    }
}
