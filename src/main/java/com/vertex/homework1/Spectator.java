package com.vertex.homework1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

@Data
@AllArgsConstructor
public class Spectator implements Comparable<Spectator> {

    private String name;
    private String sex;
    private int whiskers;
    private int broach;


    public int compareTo(Spectator other) {
        if (getSex().equals(other.getSex())) {
            if (getWhiskers() == 0) {
                return other.getBroach() - getBroach();
            } else {
                return other.getWhiskers() - getWhiskers();
            }
        } else if (getSex().length() > other.getSex().length()) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Spectator alan = new Spectator("Alan", "man", 23, 0);
        Spectator lucy = new Spectator("Lucy", "woman", 0, 2);
        Spectator anna = new Spectator("Anna", "woman", 0, 6);
        Spectator andrew = new Spectator("Andrew", "man", 5, 0);

        Queue<Spectator> spectators = new PriorityQueue<>(Arrays.asList(alan, lucy, anna, andrew));

        System.out.println(spectators);
    }
}