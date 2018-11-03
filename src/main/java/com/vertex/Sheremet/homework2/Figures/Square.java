package com.vertex.Sheremet.homework2.Figures;

public class Square implements Figure {

    private Point lowerLeftCorner;
    private int side;

    public Square() {

    }

    public Square(int coordinateX, int coordinateY, int side) {
        lowerLeftCorner = new Point(coordinateX, coordinateY);
        this.side = side;
    }

    public static class Builder {

        private Square square;

        public Builder() {
            square = new Square();
        }

        public Builder withPoint(Point lowerLeftCorner) {
            square.lowerLeftCorner = lowerLeftCorner;
            return this;
        }

        public Builder withSide(int side) {
            square.side = side;
            return this;
        }

        public Square build() {
            return square;
        }
    }

    public Point getLowerLeftCorner() {
        return lowerLeftCorner;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "point=" + lowerLeftCorner +
                ", side=" + side +
                '}';
    }
}
