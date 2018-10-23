package com.vertex.homework2.figure.implementation;

import com.vertex.homework2.figure.Point;

public class Rectangle extends AbstractFigure {

    private Square preparationSquare;
    private double litleSide;

    public Rectangle(){

    }
    public Rectangle(Square preparationSquare, double litleSide){
        this.litleSide = litleSide;
        this.preparationSquare = preparationSquare;

    }
    public static class BuilderRectangle{
        private Rectangle rectangle;

        public BuilderRectangle(){
            rectangle = new Rectangle();
        }

        public BuilderRectangle withPreparationSquare(Square preparationSquare){
            rectangle.preparationSquare = preparationSquare;
            return this;
        }
        public BuilderRectangle withLitleSide(double litleSide){
            rectangle.litleSide = litleSide;
            return this;
        }

        public Rectangle build(){return new Rectangle(rectangle.preparationSquare, rectangle.litleSide);}
    }

    public void drawRectangleHorizontal(){
        System.out.print( " Rectangle location - horizontal ");
        draw();
    }
    public void drawRectangleVertical(){
        System.out.print( " Rectangle location - vertical ");
        draw();
    }

    @Override
    public void draw() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "preparationSquare=" + preparationSquare +
                ", litleSide=" + litleSide +
                '}';
    }
    public static void main(String[] args) {
        BuilderRectangle builder = new BuilderRectangle()
                .withPreparationSquare(new Square(new Point(Math.floor(Math.random()*100)/10, Math.floor(Math.random()*100)/10),Math.floor(Math.random()*100+10)/10))
                .withLitleSide( Math.floor(Math.random()*20+1)/10);

        Rectangle rectangle = builder.build();
        Rectangle rectangle2 = builder.withLitleSide(8.9).withPreparationSquare(new Square(new Point(Math.floor(Math.random()*100)/10, Math.floor(Math.random()*100)/10),Math.floor(Math.random()*100+10)/10)).build();
        rectangle.draw();
        rectangle.drawRectangleHorizontal();
        rectangle2.drawRectangleVertical();




    }

}
