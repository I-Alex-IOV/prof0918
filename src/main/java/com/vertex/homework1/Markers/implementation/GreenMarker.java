package com.vertex.homework1.Markers.implementation;


public class GreenMarker implements Marker {

    @Override
    public void write(String write) {
        System.out.println((char) 27 + "[32m " + write + (char)27 + "[0m");
    }

}
