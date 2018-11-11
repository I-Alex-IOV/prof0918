package com.vertex;

import com.vertex.homework3_4.ConcertContest;
import com.vertex.homework3_4.Sale;
import com.vertex.homework3_4.TicketWindow;
import com.vertex.homework3_4.first_part.Listener;
import com.vertex.homework3_4.first_part.ListenerQueue;

public class Main {

    public static void main(String[] args) {

        ListenerQueue listenerQueue = new ListenerQueue();
        listenerQueue.addListener(new Listener("Salvador Dali", 12, true, 1));
        listenerQueue.addListener(new Listener("Queen Elizabeth II", 45, false,2));
        listenerQueue.addListener(new Listener("Adolf Hitler", 6, true, 1));
        listenerQueue.addListener(new Listener("Albert Einstein", 15, true, 1));
        listenerQueue.addListener(new Listener("Liliane de Bettencourt", 38, false, 10));
        listenerQueue.addListener(new Listener("Elis Wolton", 33, false, 3));
        listenerQueue.addListener(new Listener("Aleksandr Lukashenko", 8, true, 2));
        listenerQueue.addListener(new Listener("Jacqueline Mars", 25, false, 12));
        listenerQueue.addListener(new Listener("Elon Musk", 0,true, 7));
        listenerQueue.addListener(new Listener("Susan Klatten", 20, false, 3));
        listenerQueue.addListener(new Listener("New Man", 0, true, 3));
        listenerQueue.addListener(new Listener("New Woman", 0, false, 3));

        listenerQueue.printQueue();

        System.out.println();

        TicketWindow ticketWindow = new TicketWindow(listenerQueue);
        ticketWindow.sellTicket();
        ticketWindow.print();

        System.out.println();

        ConcertContest cc = new ConcertContest(ticketWindow.getTicketOwner());
        cc.winners();

        System.out.println();

        Sale sale = new Sale(ticketWindow.getTicketOwner());
        sale.printSaleaParticipants();
    }
}
