package com.vertex.homework3;

import java.util.ArrayList;
import java.util.HashMap;

public class CashBox {
    private static HashMap<Ticket,Spectator> owners;
    private int rowAmount;
    private int seatAmount;
    private static ArrayList<Ticket> tickets=new ArrayList<>();
    private static int ticketCounter=1;
    public CashBox(int rowAmount,int seatAmount) {
        this.rowAmount=rowAmount;
        this.seatAmount=seatAmount;
        for (int i=1;i<rowAmount+1;i++){
            for (int j=1;j<seatAmount+1;j++){
                Ticket ticket=new Ticket(i,j,ticketCounter);
                ticketCounter++;
                tickets.add(ticket);
            }
        }

    }
    public HashMap<Ticket,Spectator> getOwners() {
        owners = new HashMap<>();
        for(Spectator i:Spectator.getQueue()) {
            owners.put(tickets.get(0), i);
            tickets.remove(0);
        }
        return owners;

    }

    private static ArrayList<Ticket> getTickets() {
        return tickets;
    }

}
