package com.vertex.homework3_4;

import com.vertex.homework3_4.first_part.Listener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ConcertContest {

    private HashMap<Ticket, Listener> ticketOwner;
    private ArrayList<Listener> winnersList;

    public ConcertContest(HashMap<Ticket, Listener> ticketOwner){
        this.ticketOwner = ticketOwner;
        winnersList = new ArrayList<>();
    }

    private void getListWinners(){
        Collection<Listener> source = ticketOwner.values();
        winnersList.addAll(source.stream()
                .filter((x) -> !x.getSex())
                .distinct()
                .collect(Collectors.groupingBy(Listener::getPriority))
                .get(source.stream()
                        .filter((x) -> !x.getSex())
                        .collect(Collectors.groupingBy(Listener::getPriority))
                        .keySet()
                        .stream()
                        .min(Integer::compareTo)
                        .get()));

        winnersList.addAll(source.stream()
                .filter(Listener::getSex)
                .distinct()
                .collect(Collectors.groupingBy(Listener::getPriority))
                .get(source.stream()
                        .filter(Listener::getSex)
                        .collect(Collectors.groupingBy(Listener::getPriority))
                        .keySet()
                        .stream()
                        .min(Integer::compareTo)
                        .get()));
    }

    public void winners(){
        getListWinners();
        HashMap<Ticket, Listener> winners = new HashMap<>();
        for (Map.Entry<Ticket, Listener> entry : ticketOwner.entrySet()){
            for (Listener l : winnersList){
                if (entry.getValue().equals(l)){
                    entry.getKey().setWinner(true);
                    winners.put(entry.getKey(),entry.getValue());
                }
            }
        }
        System.out.println(winners);
    }
}
