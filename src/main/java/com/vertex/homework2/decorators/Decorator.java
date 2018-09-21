package com.vertex.homework2.decorators;

import com.vertex.homework2.figure.Figure;
import com.vertex.homework2.figure.Point;

public abstract class Decorator implements Figure {
    protected Figure figure;
    public Decorator (Figure figure){
        this.figure=figure;
    }
    public abstract void moShowFigure();

    @Override
    public void showFigure(Point point) {
        figure.showFigure(point);
        moShowFigure();
    }
}
