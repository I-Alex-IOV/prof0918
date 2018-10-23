package com.vertex.homework2.figure;

import com.vertex.homework2.figure.implementation.*;

public enum FigureType {

    CIRCLE {
        @Override
        public AbstractFigure buildFigure(){return new Circle(new Point(Math.floor(Math.random()*100)/10, Math.floor(Math.random()*100)/10), Math.floor(Math.random()*100+1)/10);}

    },
    SQUARE{
        @Override
        public AbstractFigure buildFigure(){return new Square(new Point(Math.floor(Math.random()*100)/10, Math.floor(Math.random()*100)/10), Math.floor(Math.random()*100+10)/10);}
    },
    OVALE{
        @Override
        public AbstractFigure buildFigure(){return  new Oval(new Circle(new Point(Math.floor(Math.random()*100)/10, Math.floor(Math.random()*100)/10),Math.floor(Math.random()*50+1)/10), Math.floor(Math.random()*20+1)/10);}
    },
    RECTANGLE{
        @Override
        public AbstractFigure buildFigure(){ return new Rectangle(new Square(new Point(Math.floor(Math.random()*100)/10, Math.floor(Math.random()*100)/10),Math.floor(Math.random()*100+10)/10), Math.floor(Math.random()*20+1)/10);}
    }

    ;
    public abstract AbstractFigure buildFigure();
}
