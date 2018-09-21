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


public class Artist implements ArtisrInterface {
    Point point = new Point(0,0);
    private int quantity;
    private Queue<Figure > figuresQueue = new LinkedList<>();


    public void arrayFilling() {
        for (int i = 0; i < 25; i++) {
            figuresQueue.add(FiguresSelector.getInstance().figures(TypeOfFigure.CIRCLE));
            figuresQueue.add(FiguresSelector.getInstance().figures(TypeOfFigure.OVAL));
            figuresQueue.add(FiguresSelector.getInstance().figures(TypeOfFigure.SQUARE));
            figuresQueue.add(FiguresSelector.getInstance().figures(TypeOfFigure.RECTANGULAR));
        }
    }
    @Override
    public void draw() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many pieces to draw? ");
        quantity = in.nextInt();
        in.close();
        Figure figure ;
        arrayFilling();
        if (figuresQueue != null) {
            for (int i = 0; i < quantity; i++) {
                figure = figuresQueue.poll();
                System.out.println(i);
                figure.showFigure(point);
                if (figure instanceof Oval) {
                    ((OvalDecorator) figure).moShowFigure();
                    if (figure instanceof Oval) {
                        ((RectagularDecorator) figure).moShowFigure();
                    }
                }
            }
        }
    }
}




