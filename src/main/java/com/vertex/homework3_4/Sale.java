package com.vertex.homework3_4;

import com.vertex.homework3_4.first_part.Listener;

import java.util.*;

public class Sale {

    private HashSet<Listener> salesParticipant;
    private List<Listener> listeners;

    public Sale(HashMap<Ticket, Listener> listeners){
        salesParticipant = new HashSet<>();
        this.listeners = new ArrayList<>(listeners.values());
    }

    private void getSalesParticipant(){
        listeners.stream().filter((x) -> x.getNumberOfTickets() > 1).distinct().forEach(salesParticipant::add);
    }

    public void printSaleaParticipants(){
        getSalesParticipant();
        salesParticipant.forEach(System.out::println);
    }
}
