package com.vertex.Sheremet.homework2;

public class ArtistProxy extends Artist {

    Artist artist;

    ArtistProxy(Artist artist) {
        super();
        this.artist = artist;
    }

    @Override
    public void draw(int number) {
        System.out.println("Сетить именно прокси");
        artist.draw(number);
    }
}
