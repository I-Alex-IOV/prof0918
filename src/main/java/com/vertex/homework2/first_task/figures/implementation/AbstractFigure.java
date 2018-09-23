package com.vertex.homework2.first_task.figures.implementation;

import com.vertex.homework2.first_task.figures.Figure;
import com.vertex.homework2.first_task.figures.Point;


public abstract class AbstractFigure implements Figure {

    private Point p;
    private double width;
    private double height;

    AbstractFigure(){
        p = new Point();
        width = 0;
        height = 0;
    }

    AbstractFigure (Point p, double width, double height){
        this.p = p;
        this.width = width;
        this.height = height;
    }

    void setP(Point p) {
        this.p = p;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    Point getP() {
        return p;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    @Override
    public void draw(int amount) {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() + ": " + p +
                ", width = " + width +
                ", height = " + height;// + '\n';
    }
}
