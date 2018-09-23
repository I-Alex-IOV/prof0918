package com.vertex.homework1.markerFactory;

import com.vertex.homework1.markerFactory.implementation.BlackMarker;
import com.vertex.homework1.markerFactory.implementation.GreenMarker;
import com.vertex.homework1.markerFactory.implementation.RedMarker;

public class MarkerFactory {

    public Marker getMarker(MarkerTypes type){

        Marker toReturn;
        switch (type) {
            case RED:
                toReturn = new RedMarker();
                break;
            case GREEN:
                toReturn = new GreenMarker();
                break;
            case BLACK:
                toReturn = new BlackMarker();
                break;
            default:
                throw new IllegalArgumentException("Wrong marker type" + type);
        }

        return toReturn;
    }
}
