package com.vertex.homework1;

import com.vertex.homework1.markerFactory.Marker;
import com.vertex.homework1.markerFactory.MarkerFactory;

class Teacher {

    private MarkerFactory marker;

    Teacher(){
        marker = new MarkerFactory();
    }

    MarkerFactory getMarker() {
        return marker;
    }

    void writeText(Marker marker, String text){
        marker.write(text);
    }


}
