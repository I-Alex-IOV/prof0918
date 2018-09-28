package com.vertex.homework2.implementations;

import com.vertex.homework2.Circle;
import com.vertex.homework2.ImmutablePoint;
import com.vertex.homework2.JustForRandom.ColorRandom;
import com.vertex.homework2.Square;
import com.vertex.homework2.implementations.AbstractFigure;

public enum FigureType  {
    Square{
        public AbstractFigure buildFigure(){
            return new Square(Math.random(),new ImmutablePoint(Math.random(),Math.random()), ColorRandom.color());
        }
    },
    Circle {
        public AbstractFigure buildFigure() {
            return new Circle(Math.random(), ColorRandom.color(), new ImmutablePoint(Math.random(), Math.random()));
        }

    };
    public abstract AbstractFigure buildFigure();
}
