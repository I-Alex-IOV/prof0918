package com.vertex.homework2.factory;


import com.vertex.homework2.decorators.OvalDecorator;
import com.vertex.homework2.decorators.RectagularDecorator;
import com.vertex.homework2.figure.*;


public class FiguresSelector {
    private static volatile FiguresSelector instance;

    private FiguresSelector() {
    }

    public static FiguresSelector getInstance() {
        if (instance == null) {
            synchronized (FiguresSelector.class) {
                if (instance == null) {
                    instance = new FiguresSelector();
                }
            }
        }
        return instance;
    }
    public Figure figures(TypeOfFigure typeOfFigure) {
        Figure figure = null;
        switch (typeOfFigure) {
            case OVAL:
                int width =(int)( Math.random()*100);
                int height = (int)(Math.random()*100);
                figure = new OvalDecorator(new Oval.OvalBuilder()
                        .name(Oval.class.getName())
                        .width(width)
                        .height(height).build());
                break;
            case CIRCLE:
                int radius=(int)( Math.random()*100);
                figure = new Circle.CircleBuilder()
                        .name(Circle.class.getName())
                        .radius(radius).build();
                break;
            case SQUARE:
                int side=(int)( Math.random()*100);
                figure = new Square.SquareBuilder()
                        .name(Square.class.getName())
                        .side(side).build();
                break;
            case RECTANGULAR:
                int  widthRectangular=(int)( Math.random()*100);
                int  heightRectangular = (int)( Math.random()*100);
                figure = new RectagularDecorator(new Rectangular.RectangularBuilder()
                        .name(Rectangular.class.getName())
                        .widthRectangular(widthRectangular)
                        .heightRectangular(heightRectangular )
                        .build());
                break;
                default:
                    System.out.println("there is no such figure");

        }
        return figure;
    }

    }






