package com.vertex.homework2.first_task.figures.implementation;

import com.vertex.homework2.first_task.figures.Point;

//Билдер является декоратором. Расширяет функционал прямоугольника, если захотелось переделать из квадрата. Где использовать, не придумала, поэтому "is never used"
public class Rectangular extends AbstractFigure {

    public Rectangular(Point p, double width, double height){
        super(p, width, height);
    }

    private Rectangular(){}

    public static class Builder{

        Rectangular rectangular;

        public Builder(){
            rectangular = new Rectangular();
        }

        public Builder horizontalRectangleFromSquare(Square square, double width){
            rectangular.setP(square.getP());
            rectangular.setHeight(square.getHeight());
            rectangular.setWidth(width);
            return this;
        }

        public Builder verticalRectangleFromSquare(Square square, double height){
            rectangular.setP(square.getP());
            rectangular.setHeight(height);
            rectangular.setWidth(square.getWidth());
            return this;
        }


    }
}
