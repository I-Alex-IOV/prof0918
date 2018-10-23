package com.vertex.homework2.Artist;

import com.vertex.homework2.figure.Figure;
import com.vertex.homework2.figure.FigureFactory;
import com.vertex.homework2.figure.FigureType;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Artist implements ArtistImpl{

    private int quantity = 100;
    private int counter = 0;
    private int counter2 = 0;
    final BlockingQueue<Figure> inicialization = new ArrayBlockingQueue<Figure>(quantity) ;

    @Override
    public void draw() {
        new Thread(){
            public void run(){

                     while (counter < quantity) {
                         try {
                             inicialization.put(FigureFactory.getFigure(FigureType.CIRCLE));
                             inicialization.put(FigureFactory.getFigure(FigureType.OVALE));
                             inicialization.put(FigureFactory.getFigure(FigureType.SQUARE));
                             inicialization.put(FigureFactory.getFigure(FigureType.RECTANGLE));
                                if(counter == quantity/4) {
                                    break;
                                }
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                         counter++;

                     }

            }
        }.start();

        new Thread(){
            public void run(){

                try {
                    Figure figure;
                    while (counter2 < quantity) {
                        figure = inicialization.take();
                        System.out.println("The figure number " + (++counter2) + " is drawn");
                        figure.draw();


                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }.start();


    }

    public static void main(String[] args) {
        Artist artist = new Artist();
        artist.draw();

    }

}
