package com.vertex.homework2.first_task.figures;

import com.vertex.homework2.first_task.figures.implementation.*;

// захардкодила значения по умолчанию, вообще не понятно, это нормальный вариант реализации или в данном случае надо было как-то по другому писать
// фабрику, чтоб значения задавались при инициализации, если да, то как такое написать?
// TODO: 24.09.2018 you can make it with Random values
public enum FigureType {
    CIRCLE {
        @Override
        public AbstractFigure draw() {
            return new Circle(new Point(), 0);
        }
    }, SQUARE {
        @Override
        public AbstractFigure draw() {
            return new Square(new Point(), 0);
        }
    }, OVAL {
        @Override
        public AbstractFigure draw() {
            return new Oval(new Point(), 0, 0);
        }
    }, RECTANGLE {
        @Override
        public AbstractFigure draw() {
            return new Rectangular(new Point(), 0, 0);
        }
    };

    public abstract AbstractFigure draw();
}
