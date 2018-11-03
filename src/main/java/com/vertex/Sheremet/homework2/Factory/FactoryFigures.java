package com.vertex.Sheremet.homework2.Factory;

import com.vertex.Sheremet.homework2.Figures.*;

public class FactoryFigures {

    public Figure getFigures(FigureType type) {
        Figure toReturn = null;
        switch (type) {
            case CIRCLE:
                toReturn = new Circle(2, 2, 4);
                break;
            case OVAL:
                toReturn = new Oval(new Circle(2, 2, 3), 5);
                break;
            case SQUARE:
                toReturn = new Square(2, 2, 4);
                break;
            case RECTANGUAL:
                toReturn = new Rectangular(new Square(2, 2, 4), 8);
                break;
            default:
                throw new IllegalArgumentException("Wrong figure type:" + type);
        }
        return toReturn;
    }
}
