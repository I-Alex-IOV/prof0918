package com.vertex.homework2.p;

import com.vertex.homework2.decorators.OvalDecorator;
import com.vertex.homework2.decorators.RectagularDecorator;
import com.vertex.homework2.factory.FiguresSelector;
import com.vertex.homework2.factory.TypeOfFigure;
import com.vertex.homework2.figure.Figure;
import com.vertex.homework2.figure.Oval;
import com.vertex.homework2.figure.Point;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class Artist implements ArtisrInterface {
    Point point = new Point(0,0);
    private int quantity;
    final BlockingQueue<Figure> queue = new ArrayBlockingQueue<Figure>(100);

    @Override
    public void draw() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many pieces to draw? ");
        quantity = in.nextInt();
        in.close();

        new Thread() {
            public void run() {
                for (int i = 0; i < quantity; i++) {
                    try {
                        queue.put((FiguresSelector.getInstance().figures(TypeOfFigure.CIRCLE)));
                        queue.put((FiguresSelector.getInstance().figures(TypeOfFigure.OVAL)));
                        queue.put((FiguresSelector.getInstance().figures(TypeOfFigure.SQUARE)));
                        queue.put((FiguresSelector.getInstance().figures(TypeOfFigure.RECTANGULAR)));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(2_000);
                    Figure figure;
                    for (int i = 0; i < quantity; i++) {
                        figure = queue.take();
                        System.out.println(i);
                        figure.showFigure(point);
                        if (figure instanceof Oval) {
                            ((OvalDecorator) figure).moShowFigure();
                            if (figure instanceof Oval) {
                                ((RectagularDecorator) figure).moShowFigure();
                            }
                        }

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}




