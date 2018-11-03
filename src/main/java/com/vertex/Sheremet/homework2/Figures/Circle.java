package com.vertex.Sheremet.homework2.Figures;

public class Circle implements Figure {

    private Point center;
    private int radius;

    public Circle() {
    }

    public Circle(int coordinateX, int coordinateY, int radius) {
        center = new Point(coordinateX, coordinateY);
        this.radius = radius;
    }

    public static class Builder {

        private Circle circlep;

        public Builder() {
            circlep = new Circle();
        }

        public Builder withPoint(Point center) {
            circlep.center = center;
            return this;
        }

        public Builder withRadius(int radius) {
            circlep.radius = radius;
            return this;
        }

        public Circle build() {
            return circlep;
        }

    }

    public int getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
