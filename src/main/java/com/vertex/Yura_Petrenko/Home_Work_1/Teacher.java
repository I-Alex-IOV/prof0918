package com.vertex.Yura_Petrenko.Home_Work_1;

public class Teacher {

      private String textTeacher = "Мой дядя самых честных правил";

     public void writeText(Marker marker){
      int count = marker.getColorCount();
        if(count > 0){
       marker.ColorText(this.textTeacher);
       count =- 1;
       }
       else System.out.println("Маркеры закончились");

    }
}
