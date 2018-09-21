package com.vertex.homework2.decorators;

import com.vertex.homework2.figure.Rectangular;

public class RectagularDecorator extends Decorator {
    public RectagularDecorator(Rectangular figure) {
        super(figure);
    }

    @Override
    public void moShowFigure() {
        System.out.println("      Perimetr rectangular = 2 * widthRectangular + 2 * heightRectangular");

    }
}
