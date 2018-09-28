package com.vertex.homework2.JustForRandom;

import java.util.Random;
//Создал этот класс чисто что бы при создании фигур в классе FigurеType можно было *ранндомно* выбрать их цвет
public class ColorRandom {
    public static String color(){
        String[] colors=new String[]{"green","blue","black","white","yellow","orange","pink","red"};
        int color=new Random().nextInt(colors.length);
        return colors[color];
    }
}
