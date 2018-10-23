package com.vertex.homework2;

import com.vertex.homework2.Artist.ArtisrProxy;
import com.vertex.homework2.Artist.Artist;

public class Main {
    public static void main(String[] args) {

        ArtisrProxy artisrProxy = new ArtisrProxy(new Artist());
        artisrProxy.draw();


    }
}
