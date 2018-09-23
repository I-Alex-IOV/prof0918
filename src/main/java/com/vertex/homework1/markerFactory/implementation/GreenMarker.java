package com.vertex.homework1.markerFactory.implementation;

import com.vertex.homework1.markerFactory.Marker;

public class GreenMarker implements Marker {
    @Override
    public void write(String text) {
        System.out.println("<green>" + text + "</green>");
    }
}
