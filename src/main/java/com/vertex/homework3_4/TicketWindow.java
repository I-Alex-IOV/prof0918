package com.vertex.homework3_4;

import com.vertex.homework3_4.first_part.Listener;
import com.vertex.homework3_4.first_part.ListenerQueue;

import java.util.*;

public class TicketWindow {

   private ListenerQueue listenerQueue;
   private List<Ticket> tickets;
   private HashMap<Ticket, Listener> ticketOwner;

   public TicketWindow(ListenerQueue listenerQueue){
       this.listenerQueue = listenerQueue;
       fillSet();
   }

    public HashMap<Ticket, Listener> getTicketOwner() {
        return ticketOwner;
    }

    private void fillSet(){
       tickets = new ArrayList<>();
       for (int i = 1; i < 10; i++) {
           for (int j = 1; j < 10; j++) {
               tickets.add(new Ticket(i, j));
           }
       }
   }

   public void sellTicket(){
       ticketOwner = new HashMap<>();
       for (Listener l : listenerQueue.getListeners()) {
           for (int i = 0; i < l.getNumberOfTickets(); i++) {
               if (tickets.size() == 0) {
                   break;
               }else {
                   ticketOwner.put(tickets.remove(0), l);
               }
           }
       }
   }

   public void print(){
       System.out.println(ticketOwner);
   }
}
