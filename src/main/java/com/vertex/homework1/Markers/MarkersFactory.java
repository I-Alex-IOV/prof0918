package com.vertex.homework1.Markers;

import com.vertex.homework1.Markers.implementation.*;


public class MarkersFactory {

    public Marker getMarker(MarkerType type){

        Marker toReturn;
        switch (type) {
            case RED:
                toReturn = new RedMarker();
                break;
            case BLUE:
                toReturn = new BlueMarker();
                break;
            case BLACK:
                toReturn = new BlackMarker();
                break;
            case YELLOW:
                toReturn = new YellowMarker();
                break;
            case GREEN:
                toReturn = new GreenMarker();
                break;
            case PURPLE:
                toReturn = new PurpleMarker();
                break;
            default:
                throw new IllegalArgumentException("Marker type" + type);
        }

        return toReturn;
    }

}
