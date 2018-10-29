package com.vertex.homework3;

import java.util.ArrayList;
import java.util.HashMap;

public class Kassa {
    public ArrayList<Lissiner> formationlistOfTicketsPurchased(ArrayList<Lissiner> lissinerArrayList) {
        ArrayList<Lissiner> arrayList = new ArrayList<>();
        for (int i = 0; i < lissinerArrayList.size(); i++) {
            for (int j = 0; j < (int) ((Math.random() * (5 - 1 + 1) + 1)); j++) {
                arrayList.add(lissinerArrayList.get(i));
            }
        }
        return arrayList;
    }

    public HashMap<Ticket, Lissiner> ticketSelling(ArrayList<Lissiner> listOfTicketsPurchased,
                                                   ArrayList<Ticket> ticketArrayList) {
        HashMap<Ticket, Lissiner> hashMap = new HashMap<>();
        for (int i = 0; i < listOfTicketsPurchased.size(); i++) {
            hashMap.put(ticketArrayList.get(i), listOfTicketsPurchased.get(i));

        }
        return hashMap;
    }
    public void showMap(HashMap<Ticket, Lissiner> ticketLissinerMap){
        System.out.println(ticketLissinerMap.entrySet());
        System.out.println();
    }
}