package com.vertex.homework2.first_task;

import com.vertex.homework2.first_task.figures.Figure;
import com.vertex.homework2.first_task.figures.FigureFactory;
import com.vertex.homework2.first_task.figures.FigureType;

import java.util.ArrayList;
import java.util.Random;

// TODO: 24.09.2018 artist is a figure? oO
public class Artist implements Figure {

    private FigureFactory factory;
    // TODO: 24.09.2018 type is raw. And very strange name for collections of figures - array when it is a list and it doesn't show what it contains
    private ArrayList array;

    public Artist(){
        factory = FigureFactory.getInstance();
        array = new ArrayList<>();
        // TODO: 24.09.2018 use result of this method to initialize array
        fillArray();
    }

    public ArrayList fillArray(){
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            FigureType type = FigureType.values()[random.nextInt(FigureType.values().length)];
            // TODO: 24.09.2018 indirectly changed! Need to create local variable and return it
            array.add(factory.drawFigure(type));
        }
        return array;
    }

    // TODO: 24.09.2018 so what stopped you from deleting?
    public void amountFigure(){//delete
        System.out.println(array.size());
    }

    @Override
    public void draw(int amount){
        for (int i = 0; i < amount; i++) {
            if (array.size() < amount){
                array = fillArray();
            }
            // TODO: 24.09.2018 very nice!!! =)
            System.out.println(array.remove(i));

        }
    }

}
