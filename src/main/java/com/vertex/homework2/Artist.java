package com.vertex.homework2;

import com.vertex.homework2.implementations.AbstractFigure;
import com.vertex.homework2.implementations.FigureType;

import java.util.ArrayList;

public class Artist {
    ArrayList<AbstractFigure> lst=new ArrayList<AbstractFigure>();
    public Artist(){


        initialize();

    }
    public void initialize(){
        for (int i=0;i<50;i++){
            lst.add(FigureFactory.getFigure(FigureType.Circle));
        }
        for (int k=0;k<50;k++){
            lst.add(FigureFactory.getFigure(FigureType.Square));
        }
    }
    public void work(int z){
        for (int i=0;i<z;i++){
            System.out.println("Drawing "+lst.get(i));   //вот тут я прокололся,теперь как вывести все данные о фигуре,а не просто объект не знаю:(
            lst.remove(i);
        }
    }
    public void checkWorking(){
        System.out.println("The artist will draw "+ lst.size()+" figures");  //проверка для к-ва оставшихся ненарисованных фигур у художника
    }
}
