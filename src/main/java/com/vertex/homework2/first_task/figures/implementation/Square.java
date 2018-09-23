package com.vertex.homework2.first_task.figures.implementation;

import com.vertex.homework2.first_task.figures.Point;

public class Square extends AbstractFigure {

    public Square(Point p, double side) {
        this.setP(p);
        this.setWidth(side);
        this.setHeight(side);
    }


}
