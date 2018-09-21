package com.vertex.homework2.figure;

import java.util.Objects;

public class Circle  implements Figure {
    private final String name;
    private final int radius;

    private Circle(final CircleBuilder circleBuilder) {
        this.name = circleBuilder.getName();
        this.radius = circleBuilder.getRadius();
    }

    public static class CircleBuilder {
        private String name;
        private int radius;

        public CircleBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public String getName() {
            return name;
        }

        public CircleBuilder radius(final int radius) {
            this.radius = radius;
            return this;
        }

        public int getRadius() {
            return radius;
        }

        public Circle build() {
            return new Circle(this);
        }
    }

    @Override
    public void showFigure(Point point) {
        System.out.println("Show com.cameramnet1.figure.Circle with point "+point.getX()+","+point.getY()+"  radius ="+radius);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("com.cameramnet1.figure.Circle{");
        sb.append("name='").append(name).append('\'');
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius &&
                Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, radius);
    }
}
