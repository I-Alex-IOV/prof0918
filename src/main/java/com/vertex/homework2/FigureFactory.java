package com.vertex.homework2;
import com.vertex.homework2.implementations.AbstractFigure;
import com.vertex.homework2.implementations.Figure;
import com.vertex.homework2.implementations.FigureType;
import lombok.NonNull;

public class FigureFactory {
    public static AbstractFigure getFigure(FigureType figureType){
        return figureType.buildFigure();
    }
}
