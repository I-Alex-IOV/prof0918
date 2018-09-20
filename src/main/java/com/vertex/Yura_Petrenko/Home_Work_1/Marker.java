package com.vertex.Yura_Petrenko.Home_Work_1;

public class Marker {

    private int markerCountRed = 3;
    private  String MarkerColorRed = "Red";

    private int markerCountBlack = 5;
    private  String MarkerColorBlack = "Black";

    private int markerCountBlue = 1;
    private  String MarkerColorBlue = "Blue";

    private int colorCount = 0;

   Marker(String color){

       if(color.contains("Red")){
           colorCount = this.markerCountRed;
       }
       else System.out.println("Такого цвета нет");

   }




    public int getMarkerCountRed() {
        return markerCountRed;
    }

    public int getColorCount() {
        return colorCount;
    }

    public void setColorCount() {
        this.colorCount =- 1;
    }
}
