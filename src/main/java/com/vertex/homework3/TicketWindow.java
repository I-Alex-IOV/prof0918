package com.vertex.homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TicketWindow {
    private ArrayList<Ticket> ticketArrayList;
    private HashMap<Ticket, Lissiner> ticketLissinerMap;
    final private int countLine = 20;
    final private int countPlase = 40;

    public ArrayList<Ticket> getTicketArrayList() {
        return ticketArrayList;
    }

    public void setTicketArrayList(ArrayList<Ticket> ticketArrayList) {
        this.ticketArrayList = ticketArrayList;
    }

    public void ticketPrinting() {

        ticketArrayList = new ArrayList<>();
        for (int i = 1; i < countLine + 1; i++) {
            switch (i) {
                case 1:
                    for (int j = 0; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 1000, j, i, false));
                    }
                    break;
                case 2:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 1100, j, i, false));
                    }
                    break;
                case 3:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 1200, j, i, false));
                    }
                    break;
                case 4:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 1300, j, i, false));
                    }
                    break;
                case 5:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 1400, j, i, false));
                    }
                    break;
                case 6:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 1500, j, i, false));
                    }
                    break;
                case 7:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 1600, j, i, false));
                    }
                    break;
                case 8:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 1700, j, i, false));
                    }
                    break;
                case 9:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 1800, j, i, false));
                    }
                    break;
                case 10:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 1900, j, i, false));
                    }
                    break;
                case 11:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 2000, j, i, false));
                    }
                    break;
                case 12:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 2100, j, i, false));
                    }
                    break;
                case 13:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 2200, j, i, false));
                    }
                    break;
                case 14:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 2300, j, i, false));
                    }
                    break;
                case 15:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 2400, j, i, false));
                    }
                    break;
                case 16:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 2500, j, i, false));
                    }
                    break;
                case 17:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 2600, j, i, false));
                    }
                    break;
                case 18:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 2700, j, i, false));
                    }
                    break;
                case 19:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 2800, j, i, false));
                    }
                    break;
                case 20:
                    for (int j = 1; j < countPlase + 1; j++) {
                        ticketArrayList.add(j, new Ticket(j + 2900, j, i, false));
                    }
                    break;
                default:
                    System.out.println("no plases");
            }

        }
        Collections.reverse(ticketArrayList);
    }

    public void shoy() {
        for (var a : ticketArrayList) {
            System.out.println(a.toString());
        }
    }

    public void ticketSelling() {
        ListenerCreator listenerCreator = new ListenerCreator();
        ticketLissinerMap = new HashMap<>();
        for (int i = 0; i < ticketArrayList.size(); i++) {
            ticketLissinerMap.put(ticketArrayList.get(i), listenerCreator.getLissinerArrayList().get(i));

        }
        System.out.println(ticketLissinerMap.entrySet());

    }

}
