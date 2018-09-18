package com.vertex.homework1.tkachenko;

class Teacher extends Marker {


    Teacher(String writen){

        int lenght = writen.length();

        if (lenght < getLineLength()){

            System.out.println(getColor() + writen + getColor());
            System.out.println("\n" +
                    "\n" +
                    "I finished writing");

        }else {

            System.out.println(getColor() + writen.substring(0,getLineLength()) + getColor());
            System.out.println("\n" +
                    "Opppsss!!! The marker is over");

        }


    }

}
