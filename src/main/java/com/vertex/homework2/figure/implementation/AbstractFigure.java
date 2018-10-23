package com.vertex.homework2.figure.implementation;

import com.vertex.homework2.figure.Figure;
import com.vertex.homework2.figure.Point;

public abstract class AbstractFigure implements Figure {

    private Point point;
    private double width;
    private  double heiht;

    AbstractFigure(){

        point = new Point(0.0,0.0);
        width = 0;
        heiht = 0;

    }
    AbstractFigure(Point point, double width, double heiht){

        this.point = point;
        this.width = width;
        this.heiht = heiht;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeiht() {
        return heiht;
    }

    public void setHeiht(double heiht) {
        this.heiht = heiht;
    }

    @Override
    public String toString() {
        return "AbstractFigure{" +
                "point=" + point +
                ", width=" + width +
                ", heiht=" + heiht +
                '}';
    }
}
