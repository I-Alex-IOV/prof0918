package com.vertex.homework2.p;


public class Start {
    public static void main(String[] args)  {

        ArtistProxy artistProxy = new ArtistProxy(new Artist());
        artistProxy.draw();


    }
}
