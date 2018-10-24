package com.vertex.homework3;

public class Start {
    public static void main(String[] args)  {
        ListenerCreator listenerCreator = new ListenerCreator();
        listenerCreator.createListNamesMan();
        listenerCreator.createListNamesWoman();
        listenerCreator.createListOfListener();
        System.out.println();
        listenerCreator.say();
        System.out.println();
        TicketWindow ticketWindow=new TicketWindow();
        ticketWindow.ticketPrinting();
        ticketWindow.shoy();
        System.out.println();
        ticketWindow.ticketSelling();
    }
}
