package com.vertex.Yura_Petrenko.Home_Work_1;

public class Marker {

    private int markerCountRed = 3;
    private String MarkerColorRed = "Red";

    private int markerCountBlack = 2;
    private String MarkerColorBlack = "Black";

    private int markerCountBlue = 1;
    private String MarkerColorBlue = "Blue";


    private String currentColor = null;
    private int colorCount = 0;

    Marker(String color) {

        if (color.contains("Red")) {
            this.colorCount = this.markerCountRed;
            this.currentColor = this.MarkerColorRed;

        } else if (color.contains("Black")) {
            this.colorCount = this.markerCountBlack;
            this.currentColor = this.MarkerColorBlack;
        } else if (color.contains("Blue")) {
            this.colorCount = this.markerCountBlue;
            this.currentColor = this.MarkerColorBlue;

        } else System.out.println("Такого цвета нет");
    }

    public int getColorCount() {
        return colorCount;
    }

    public void ColorText(String text) {

        if (currentColor.contains("Red")) {
            System.out.println("<red>" + text + "</red>");

        }
        else if(currentColor.contains("Black")){
            System.out.println("<black>" + text + "</black>");
        }
        else if(currentColor.contains("Blue")){
            System.out.println("<blue>" + text + "</blue>");
        }

    }
    public void setColorCount(){
        this.colorCount = this.colorCount - 1 ;
    }

}
