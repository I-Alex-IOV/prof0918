package com.company.Artist;

import com.company.Factory;
import com.company.Figures.Figure;

public class Artist implements Paint {
    Factory factory;
    Figure[] figures;

    public Artist(int size) {
        factory = factory.getFactoryInstance();
        arrInitialize(size);
    }

    public enum Shapes{
        CIRCLE,
        SQUARE,
        OVAL,
        RECTANGULAR
    }

    private void arrInitialize(int s){
        if (s == 0) {
            return;
        }
        figures = new Figure[s];
        int figType;

        for (int i = 0; i < s; i++)
        {
            figType = (int) Math.ceil((Math.random() * 4) - 1);
            if (figType == -1)
                figType = 0;
            figures[i] = factory.getFigure(Shapes.values()[figType]);
            figures[i].setPoint((int) Math.ceil((Math.random() * 1000) - 500), (int) Math.ceil((Math.random() * 1000) - 500));
            figures[i].setWidth((int) Math.ceil(Math.random() * 500));
            if (figType > 1)
                figures[i].setHeight((int) Math.ceil(Math.random() * 500));
        }
    }

    public void paint(int s){
        int pos = 0;
        while((pos < figures.length) && (figures[pos] == null))
            pos++;
        if (pos == figures.length) {
            arrInitialize(s);
            pos = 0;
        }
        for(int i = pos; i < (pos + s); i++)
        {
            if (i >= figures.length) {
                arrInitialize(s - i);
                s -= i;
                i = 0;
            }
            figures[i].printFigure();
            figures[i] = null;
        }
    }

}
