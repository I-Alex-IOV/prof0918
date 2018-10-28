package com.vertex.homework3;

import java.util.ArrayList;
import java.util.HashMap;

public class Start {
    public static void main(String[] args)  {
        final ArrayList<Ticket> ticketArrayList;
        TicketWindow ticketWindow = new TicketWindow();
        ticketArrayList=ticketWindow.ticketPrinting();

        final ArrayList<Lissiner> lissinerArrayList;
        ListenerCreator listenerCreator = new ListenerCreator();
        listenerCreator.createListNamesMan();
        listenerCreator.createListNamesWoman();
        lissinerArrayList= listenerCreator.createListOfListener();

        final  ArrayList<Lissiner> listOfTicketsPurchased;
        Kassa kassa = new Kassa();
        listOfTicketsPurchased=kassa.formationlistOfTicketsPurchased(lissinerArrayList);

        final HashMap<Ticket, Lissiner> ticketLissinerMap;
        ticketLissinerMap= kassa.ticketSelling(listOfTicketsPurchased,ticketArrayList);
        System.out.println(ticketLissinerMap.entrySet());

    }
}
