package com.vertex.homework2.figure;

import java.util.Objects;

public class Square implements Figure {
    private final String name;
    private final int side;

    private Square(final Square.SquareBuilder squareBuilder) {
        this.name = squareBuilder.getName();
        this.side = squareBuilder.getSide();
    }
    public static class SquareBuilder{
        private String name;
        private int side;

        public SquareBuilder name(final String name){
            this.name=name;
            return this;
        }

        public String getName() {
            return name;
        }

        public SquareBuilder side(final int side ){
            this.side=side;
            return this;
        }

        public int getSide() {
            return side;
        }

        public Square build(){
            return new Square(this);
        }
    }

    @Override
    public void showFigure(Point point) {
         System.out.println("Show com.cameramnet1.figure.Square with point " + point.getX() + "," + point.getY() + " sise = "+side);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("name='").append(name).append('\'');
        sb.append(", side=").append(side);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return side == square.side &&
                Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, side);
    }
}
