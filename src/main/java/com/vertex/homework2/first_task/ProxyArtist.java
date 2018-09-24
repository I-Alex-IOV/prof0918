package com.vertex.homework2.first_task;

import com.vertex.homework2.first_task.figures.Figure;

public class ProxyArtist implements Figure {

    Artist delegat;

    public ProxyArtist(){
        // TODO: 24.09.2018 why new?
        this.delegat = new Artist();
    }

    @Override
    public void draw(int amount) {
        System.out.println("We need to summon ziggurat!");
        delegat.draw(amount);
    }
}
