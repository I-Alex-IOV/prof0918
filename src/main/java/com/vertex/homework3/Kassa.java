package com.vertex.homework3;

import java.util.ArrayList;
import java.util.HashMap;

public class Kassa {
    private HashMap<Ticket, Lissiner> ticketLissinerMap;
    private ArrayList<Lissiner> listOfTicketsPurchased = new ArrayList<>();

    public ArrayList<Lissiner> getListOfTicketsPurchased() {
        return listOfTicketsPurchased;
    }

    public void setListOfTicketsPurchased(ArrayList<Lissiner> listOfTicketsPurchased) {
        this.listOfTicketsPurchased = listOfTicketsPurchased;
    }

    public HashMap<Ticket, Lissiner> getTicketLissinerMap() {
        return ticketLissinerMap;
    }

    public void setTicketLissinerMap(HashMap<Ticket, Lissiner> ticketLissinerMap) {
        this.ticketLissinerMap = ticketLissinerMap;
    }
    public void ticketSelling (){
        ticketLissinerMap= new HashMap<>();
        ListenerCreator listenerCreator = new ListenerCreator();
        listenerCreator.createListNamesMan();
        listenerCreator.createListNamesWoman();
        listenerCreator.createListOfListener();
        listenerCreator.say();
        System.out.println();
        TicketWindow ticketWindow = new TicketWindow();
        ticketWindow.ticketPrinting();
        ticketWindow.shoy();
        System.out.println();

        for (int i = 0; i <listenerCreator.getLissinerArrayList().size() ; i++) {
            for (int j = 0; j <(int)(( Math.random() * (5 - 1 + 1) + 1)) ; j++) {
                listOfTicketsPurchased.add(listenerCreator.getLissinerArrayList().get(i));
            }
        }
        for (int i = 0; i <  listOfTicketsPurchased.size(); i++) {
            ticketLissinerMap .put(ticketWindow.getTicketArrayList().get(i),listOfTicketsPurchased.get(i));

        }
    }
    public void shoyTicketLissinerMap (){


        System.out.println(ticketLissinerMap.entrySet() );
        System.out.println(ticketLissinerMap.size());
    }

}
