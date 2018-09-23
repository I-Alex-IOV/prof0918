package com.vertex.homework1.markerFactory.implementation;

import com.vertex.homework1.markerFactory.Marker;

public class RedMarker implements Marker {
    @Override
    public void write(String text) {
        System.out.println("<red>" + text + "</red>");
    }
}
