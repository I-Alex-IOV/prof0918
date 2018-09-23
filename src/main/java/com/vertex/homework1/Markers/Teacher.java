package com.vertex.homework1.Markers;

import com.vertex.homework1.Markers.implementation.Marker;

class Teacher {


    private MarkersFactory marker;
    private int lineLength = 1006;

    Teacher(){

       marker = new MarkersFactory();
    }

    MarkersFactory getMarker() {
        return marker;
    }

    void writeText(Marker marker, String write){
            int lenght = write.length();
          if ( lenght < lineLength){
              marker.write(write);
              System.out.println("\n" +
                    "\n" +
                    "I finished writing");

              System.out.println();
          }
          else {

              marker.write(write.substring(0,lineLength));
            System.out.println("\n" +
                    "Opppsss!!! The marker is over");

              System.out.println();

          }
    }




}
