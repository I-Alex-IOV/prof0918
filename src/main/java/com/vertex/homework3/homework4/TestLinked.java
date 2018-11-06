package com.vertex.homework3.homework4;

import com.vertex.homework3.Lissiner;


public class TestLinked {
    public static void main(String[] args) {
        LinkedContainer<Lissiner> lissinerLinkedContainer = new LinkedContainer<>();
        lissinerLinkedContainer.addFirst(new Lissiner("вася", "man", 3.0));
        lissinerLinkedContainer.addFirst(new Lissiner("клава", "woman", 4));

        System.out.println(lissinerLinkedContainer.size());
        for (var a : lissinerLinkedContainer) {
            System.out.println(a);
        }

    }
}


