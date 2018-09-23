package com.vertex.homework1.Markers.implementation;


public class RedMarker implements Marker {

    @Override
    public void write(String write) {

        System.out.println((char) 27 + "[31m " + write + (char)27 + "[0m");
    }

}
