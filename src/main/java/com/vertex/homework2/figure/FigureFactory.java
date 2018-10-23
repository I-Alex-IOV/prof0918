package com.vertex.homework2.figure;

import com.vertex.homework2.figure.implementation.AbstractFigure;

import java.util.EnumSet;

public final class FigureFactory {
    private static volatile FigureFactory instanse;

    private FigureFactory(){}


    public static FigureFactory getInstanse(){
        if (instanse == null){
            synchronized (FigureFactory.class){
                if(instanse == null){
                    instanse = new FigureFactory();
                }
            }
        }

        return instanse;

    }
    public static AbstractFigure getFigure(FigureType figureType){
        return figureType.buildFigure();

    }

    public static void main(String[] args) {
        EnumSet.allOf(FigureType.class)
                .stream()
                .map(FigureFactory::getFigure)
                .forEach(figure->{
                    figure.draw();
                });
    }

}
