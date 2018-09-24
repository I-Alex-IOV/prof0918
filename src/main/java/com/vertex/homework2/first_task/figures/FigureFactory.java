package com.vertex.homework2.first_task.figures;

import com.vertex.homework2.first_task.figures.implementation.AbstractFigure;

public class FigureFactory {

    private FigureFactory() {
    }

    private static class SingletonHolder{
        static final FigureFactory HOLDER_INSTANCE = new FigureFactory();    }

    public static FigureFactory getInstance() {
        return SingletonHolder.HOLDER_INSTANCE ;
    }

    // TODO: 24.09.2018 wrong place for this method. Who draws figures?
    public AbstractFigure drawFigure(FigureType figureType){return figureType.draw();}
}
