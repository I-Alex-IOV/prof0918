package com.vertex.homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhilharmonicAdministration {
    public void searchForWinningTickets(HashMap<Ticket, Lissiner> ticketLissinerMap) {
        ArrayList<Lissiner> lissinerHashSet = new ArrayList<>();
        ticketLissinerMap.values().stream()
                .filter(lissiner -> lissiner.getMustacheLength() < 1 && lissiner.getSex().equals("man"))
                .distinct()
                .forEach(lissinerHashSet::add);
        ticketLissinerMap.values().stream()
                .filter(lissiner -> lissiner.getNumberOfBrooches() < 1 && lissiner.getSex().equals("woman"))
                .distinct()
                .forEach(lissinerHashSet::add);

        ArrayList<Ticket> prize = new ArrayList<>();
        for (int i = 0; i < lissinerHashSet.size(); i++) {

            Object value = lissinerHashSet.get(i);

            Optional<Ticket> result = ticketLissinerMap.entrySet()
                    .stream()
                    .filter(entry -> value.equals(entry.getValue()))
                    .map(Map.Entry::getKey)
                    .findFirst();

            if (result.isPresent())
                prize.add(result.get());


        }
        for (var a : prize) {
            a.setPrize(true);
        }
        System.out.println();
    }

    public void broadcastAnnouncement(HashMap<Ticket, Lissiner> ticketLissinerMap) {
        ArrayList<Ticket> arrayList = new ArrayList<>();
        ticketLissinerMap.keySet().stream()
                .filter(ticket -> ticket.isPrize())
                .forEach(arrayList::add);

        for (int i = 0; i < arrayList.size(); i++) {
            if (ticketLissinerMap.get(arrayList.get(i)).getSex().equals("man")) {
                System.out.println("Владелец билета номер " + arrayList.get(i)
                        .getNumber() + " с длиной усов " + ticketLissinerMap.get(arrayList.get(i))
                        .getMustacheLength() + " получает приз");
            }
            if (ticketLissinerMap.get(arrayList.get(i)).getSex().equals("woman")) {
                System.out.println("Владелец билета номер " + arrayList.get(i)
                        .getNumber() + " с кол-вом брошей  " + ticketLissinerMap.get(arrayList.get(i))
                        .getNumberOfBrooches() + " получает приз");

            }

        }

    }

}
