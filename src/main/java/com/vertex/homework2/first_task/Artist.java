package com.vertex.homework2.first_task;

import com.vertex.homework2.first_task.figures.Figure;
import com.vertex.homework2.first_task.figures.FigureFactory;
import com.vertex.homework2.first_task.figures.FigureType;

import java.util.ArrayList;
import java.util.Random;

public class Artist implements Figure {

    private FigureFactory factory;
    private ArrayList array;

    public Artist(){
        factory = FigureFactory.getInstance();
        array = new ArrayList<>();
        fillArray();
    }

    public ArrayList fillArray(){
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            FigureType type = FigureType.values()[random.nextInt(FigureType.values().length)];
            array.add(factory.drawFigure(type));
        }
        return array;
    }

    public void amountFigure(){//delete
        System.out.println(array.size());
    }

    @Override
    public void draw(int amount){
        for (int i = 0; i < amount; i++) {
            if (array.size() < amount){
                array = fillArray();
            }
            System.out.println(array.remove(i));

        }
    }

}
