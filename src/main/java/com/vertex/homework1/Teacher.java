package com.vertex.homework1;

import com.vertex.homework1.markerFactory.Marker;
import com.vertex.homework1.markerFactory.MarkerFactory;

class Teacher {

    // TODO: 24.09.2018 not a good name for a MarketFactory
    // TODO: 24.09.2018 does a teacher have his own factory? Strange, I don't =)
    private MarkerFactory marker;

    Teacher(){
        marker = new MarkerFactory();
    }

    // TODO: 24.09.2018 getMarker should return Marker
    MarkerFactory getMarker() {
        return marker;
    }

    void writeText(Marker marker, String text){
        marker.write(text);
    }


}
