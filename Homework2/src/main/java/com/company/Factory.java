package com.company;

import com.company.Artist.Artist;
import com.company.Figures.*;

public class Factory {
    private static volatile Factory instance;

    private Factory(){}

    public static synchronized Factory getFactoryInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public Figure getFigure(Artist.Shapes name) {
        Figure toReturn;
        switch (name) {
            case CIRCLE:
                toReturn = new Circle.Builder(0,0)
                        .width(0)
                        .buidl();
                        break;
            case OVAL:
                toReturn = new Oval.Builder(0,0)
                    .width(0)
                    .height(0)
                    .buidl();
                break;
            case SQUARE:
                toReturn = new Square.Builder(0,0)
                    .width(0)
                    .buidl();
                break;
            case RECTANGULAR:
                toReturn = new Rectangular.Builder(0,0)
                    .width(0)
                    .height(0)
                    .buidl();
                break;
            default:
                throw new IllegalArgumentException("Wrong name:" + name);

        }

        return toReturn;
    }
}