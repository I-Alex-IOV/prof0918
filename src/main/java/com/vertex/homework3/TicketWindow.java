package com.vertex.homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TicketWindow {
    final private int countLine = 20;
    final private int countPlase = 40;


    public ArrayList<Ticket> ticketPrinting() {
        int ticketNumberCounter = 1000;
        ArrayList<Ticket> ticketArrayList = new ArrayList<>();

        for (int lineCounter = 1; lineCounter < countLine + 1; lineCounter++) {
            for (int placeCounter = 1; placeCounter < countPlase + 1; placeCounter++) {
                ticketArrayList.add(new Ticket(placeCounter + ticketNumberCounter, placeCounter, lineCounter, false));
            }

            ticketNumberCounter += 100;
        }

        return ticketArrayList;
    }
}