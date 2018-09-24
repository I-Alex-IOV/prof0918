package com.vertex.homework2.first_task.figures.implementation;

import com.vertex.homework2.first_task.figures.Point;

public class Circle extends AbstractFigure {

    public Circle(Point p, double side) {
        this.setP(p);
        this.setWidth(side);
        this.setHeight(side);
    }

// TODO: 24.09.2018 builder?
}
