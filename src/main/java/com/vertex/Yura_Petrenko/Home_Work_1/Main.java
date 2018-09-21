package com.vertex.Yura_Petrenko.Home_Work_1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher teacher = new Teacher();
        Marker marker = new Marker("Red");
        teacher.writeText(marker);
        teacher.writeText(marker);
        teacher.writeText(marker);
        teacher.writeText(marker);
        teacher.writeText(marker);
        Marker marker1 = new Marker("Blue");
        teacher.writeText(marker1);
        teacher.writeText(marker1);
        teacher.writeText(marker1);
        Marker marker2 = new Marker("Black");
        teacher.writeText(marker2);
        teacher.writeText(marker2);
        teacher.writeText(marker2);


    }
}
