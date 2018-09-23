package com.vertex.homework1.markerFactory.implementation;

import com.vertex.homework1.markerFactory.Marker;

public class BlackMarker implements Marker {
    @Override
    public void write(String text) {
        System.out.println("<black>" + text + "</black>");
    }
}
