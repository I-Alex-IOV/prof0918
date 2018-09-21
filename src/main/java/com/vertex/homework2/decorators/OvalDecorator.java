package com.vertex.homework2.decorators;

import com.vertex.homework2.figure.Oval;

public class OvalDecorator extends Decorator  {


    public OvalDecorator(Oval figure) {
        super(figure);
    }

    @Override
    public void moShowFigure() {
        System.out.println("  arrea Oval =(3.14*(width/2)*(height/2))");
    }
}
