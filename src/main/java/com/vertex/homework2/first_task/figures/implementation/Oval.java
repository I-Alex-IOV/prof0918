package com.vertex.homework2.first_task.figures.implementation;

import com.vertex.homework2.first_task.figures.Point;
//Билдер является декоратором. Расширяет функционал овала, если захотелось переделать из круга. Где использовать, не придумала, поэтому "is never used"

public class Oval extends AbstractFigure {

    public Oval(Point p, double width, double height){
        super(p, width, height);
    }

    private Oval(){}

    public static class Builder{

        // TODO: 24.09.2018  private?
        Oval oval;

        public Builder(){
            oval = new Oval();
        }

        public Builder horizontalOvalFromCircle(Circle circle, double width){
            oval.setP(circle.getP());
            oval.setHeight(circle.getHeight());
            oval.setWidth(width);
            return this;
        }

        public Builder verticalOvalFromCircle(Circle circle, double height){
            oval.setP(circle.getP());
            oval.setHeight(height);
            oval.setWidth(circle.getWidth());
            return this;
        }
    }
}
