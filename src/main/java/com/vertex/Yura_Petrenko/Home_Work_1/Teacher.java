package com.vertex.Yura_Petrenko.Home_Work_1;

public class Teacher {

      private String textTeacher = "Мой дядя самых честных правил";

      public void writeText(Marker marker){
          if(marker.getColorCount() > 0) {
            marker.ColorText(this.textTeacher);
            marker.setColorCount();

          }
          else System.out.println("Маркеры закончились");

      }
}
