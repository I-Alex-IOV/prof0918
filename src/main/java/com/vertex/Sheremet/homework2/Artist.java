package com.vertex.Sheremet.homework2;

import com.vertex.Sheremet.homework2.Factory.FactoryFigures;
import com.vertex.Sheremet.homework2.Factory.FigureType;
import com.vertex.Sheremet.homework2.Figures.Figure;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Artist {

    BlockingQueue<Figure> initialization;

    Artist(int size) {
        initialization = new ArrayBlockingQueue<>(size);
        for (int i = 0; i < size; i++) {
            initialization.offer(new FactoryFigures().getFigures(FigureType.CIRCLE));
            initialization.offer(new FactoryFigures().getFigures(FigureType.OVAL));
            initialization.offer(new FactoryFigures().getFigures(FigureType.SQUARE));
            initialization.offer(new FactoryFigures().getFigures(FigureType.RECTANGUAL));
        }

    }

    public Artist() {

    }

    public void draw(int number) {
        for (int i = 0; i < number; i++) {
            try {
                System.out.println(initialization.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
