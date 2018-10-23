package com.vertex.homework2.figure.implementation;

import com.vertex.homework2.figure.Point;

public class Square extends AbstractFigure {

    private double height;
    private Point lowerLeftCorner;

    public Square(){

    }

    public Square( Point lowerLeftCorner, double height){

        this.height = height;
        this.lowerLeftCorner = lowerLeftCorner;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static class BuilderSquare {

        private Square square;

        public BuilderSquare() {
            square = new Square();
        }

        public BuilderSquare withHeight(double height){
            square.height = height;
            return this;
        }

        public BuilderSquare withLowerLeftCorner(Point lowerLeftCorner){
            square.lowerLeftCorner = lowerLeftCorner;
            return this;
        }

        public Square build(){
            return new Square(square.lowerLeftCorner, square.height);
        }

    }


    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Square{" +
                "height = " + height +
                ", lowerLeftCorner = " + lowerLeftCorner +
                '}';
    }

    public static void main(String[] args) {
        BuilderSquare builder = new BuilderSquare()
                .withLowerLeftCorner(new Point(Math.floor(Math.random()*100)/10, Math.floor(Math.random()*100)/10))
                .withHeight( Math.floor(Math.random()*100+10)/10);

        Square square1 = builder.build();

        square1.draw();

        Square square2 = builder.withLowerLeftCorner(new Point(Math.floor(Math.random()*100)/10, Math.floor(Math.random()*100)/10)).withHeight(Math.floor(Math.random()*100+10)/10).build();

        square2.draw();
        square1.draw();


    }

}
