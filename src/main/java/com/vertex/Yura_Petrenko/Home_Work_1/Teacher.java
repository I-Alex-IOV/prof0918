package com.vertex.Yura_Petrenko.Home_Work_1;

public class Teacher {

     public void writeText(Marker marker){
      int count = marker.getColorCount();
        if(count > 0){
       System.out.println("<red>Мой дядя самых честных правил</red>");
       marker.setColorCount();
       }
       else System.out.println("Маркеры закончились");

    }
}
