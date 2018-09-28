package com.company.Artist;

public class ArtistProxy implements Paint {
    int arrSize;
    Artist artist;

    public ArtistProxy(int size) {
        arrSize = size;
    }

    public void paint(int s) {
        if (artist == null) {
            artist = new Artist(arrSize);
        }
        artist.paint(s);
    }
}
