package com.vertex.homework2.p;

public class ArtistProxy  implements ArtisrInterface {
    Artist delegate;
    public ArtistProxy(Artist delegate){
        this.delegate=delegate;
    }
    @Override
    public void draw() {
        System.out.println("All the figures are painted in red");
        delegate.draw();


    }
}
