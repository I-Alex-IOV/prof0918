package com.vertex.homework2.p;

import com.vertex.homework2.decorators.OvalDecorator;
import com.vertex.homework2.decorators.RectagularDecorator;
import com.vertex.homework2.factory.FiguresSelector;
import com.vertex.homework2.factory.TypeOfFigure;
import com.vertex.homework2.figure.Figure;
import com.vertex.homework2.figure.Oval;
import com.vertex.homework2.figure.Point;
import com.vertex.homework2.figure.Rectangular;

import java.util.LinkedList;
import java.util.Objects;
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
                            if (figure instanceof Rectangular) {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Artist{");
        sb.append("point=").append(point);
        sb.append(", quantity=").append(quantity);
        sb.append(", queue=").append(queue);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artist)) return false;
        Artist artist = (Artist) o;
        return quantity == artist.quantity &&
                Objects.equals(point, artist.point) &&
                Objects.equals(queue, artist.queue);
    }

    @Override
    public int hashCode() {

        return Objects.hash(point, quantity, queue);
    }
}




