package com.vertex.homework1.Markers.implementation;


public class PurpleMarker implements Marker {

    @Override
    public void write(String write) {
        System.out.println((char) 27 + "[35m " + write + (char)27 + "[0m");
    }

}
