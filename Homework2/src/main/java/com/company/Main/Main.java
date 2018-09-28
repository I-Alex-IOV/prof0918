package com.company.Main;

import com.company.Artist.ArtistProxy;
import com.company.Artist.Paint;

public class Main {

    public static void main(String[] args) {
        Paint art0 = new ArtistProxy(2);
        art0.paint(1);
        art0.paint(1);
        art0.paint(1);
        art0.paint(33);
    }
}
