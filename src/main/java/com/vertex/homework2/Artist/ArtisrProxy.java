package com.vertex.homework2.Artist;

public class ArtisrProxy implements ArtistImpl {

    Artist delegate;
    public  ArtisrProxy(Artist delegate){
        this.delegate = delegate;
    }

    @Override
    public void draw() {

        System.out.println("The whole block of figures is drawn.");
        System.out.println("All figures are drawn");
        delegate.draw();

    }

}
