package com.vertex.homework3_4.first_part;

import java.util.*;

public class ListenerQueue{

    private List<Listener> listeners;

    public ListenerQueue() {
        this.listeners = new ArrayList<>();
    }

    public void addListener(Listener listener){
        this.listeners.add(listener);
        listeners.sort(Comparator.comparing(Listener::getSex).reversed().thenComparing(Listener::getPriority).reversed());
        printQueue();
    }

    public List<Listener> getListeners() {
        return new ArrayList<>(listeners);
    }

    public void printQueue(){
        listeners.forEach(System.out::println);
    }
}
