package com.vertex.Sheremet.homework2;

public class Main {
    public static void main(String[] args) {
        ArtistProxy artistProxy = new ArtistProxy(new Artist(15));
        artistProxy.draw(5);
    }
}
