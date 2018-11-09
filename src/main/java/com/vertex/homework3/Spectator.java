package com.vertex.homework3;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Spectator implements Comparable<Spectator>{
    private static ArrayList<String> womanNames=new ArrayList<>();
    private static ArrayList<String> manNames=new ArrayList<>();
    private String name;
    private String sex;
    private int age;
    private int whiskers;
    private int broach;
    private int howManyTickets;
    private static int i=0;
    public Spectator(String name,String sex,int age,int whiskers,int broach,int howManyTickets) {
        this.name=name;
        this.sex = sex;
        this.age = age;
        this.whiskers = whiskers;
        this.broach = broach;
        this.howManyTickets = howManyTickets;
        i++;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getBroach() {
        return broach;
    }

    public int getWhiskers() {
        return whiskers;
    }
    public static int getI(){
        return i;
    }

    public int getHowManyTickets() {
        return howManyTickets;
    }
    public static int randomWithRange(int min,int max){
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    private static ArrayList<Spectator> createQueue(int amount){
        ArrayList<Spectator> forqueue=new ArrayList<>();
        for (int i=1;i<amount+1;i++){
            forqueue.add(new Spectator(randomWomanNames(),"woman",randomWithRange(6,88),0,randomWithRange(0,10),randomWithRange(0,5)));
            forqueue.add(new Spectator(randomManNames(),"man",randomWithRange(6,88),randomWithRange(0,20),0,randomWithRange(0,5)));
        }
        return forqueue;
    }
    private static ArrayList<Spectator> forPriorityQueue=createQueue(4);
    private static Queue<Spectator> spectators=new PriorityQueue<>(forPriorityQueue);
    public static PriorityQueue<Spectator> getQueue(){
        return (PriorityQueue<Spectator>) spectators;
    }

    public static String randomWomanNames(){
        womanNames.add("Yuliya");
        womanNames.add("Anna");
        womanNames.add("Monica");
        womanNames.add("Evgeniya");
        womanNames.add("Jessica");
        womanNames.add("Alina");
        womanNames.add("Maria");
        womanNames.add("Lucy");
        int indexRandomWomanName=(int)(Math.random()*womanNames.size());

        return womanNames.get(indexRandomWomanName);

    }
    public static String randomManNames(){
        manNames.add("Oleg");
        manNames.add("Dima");
        manNames.add("Jora");
        manNames.add("Johnatan");
        manNames.add("Vova");
        manNames.add("Alex");
        manNames.add("Bohdan");
        manNames.add("Juan");
        int indexRandomManMan=(int)(Math.random()*manNames.size());

        return manNames.get(indexRandomManMan);
    }

    public int compareTo(Spectator other) {
        if (getSex().equals(other.getSex())) {
            if (getWhiskers() == 0) {
                if((other.getBroach() - getBroach())!=0) {
                    return other.getBroach()-getBroach();
                }else{
                    return other.getAge()-getAge();
                }
            } else {
                if((other.getWhiskers() - getWhiskers())!=0){
                    return other.getWhiskers()-getWhiskers();
                }else{
                    return other.getAge()-getAge();
                }
            }
        } else if (getSex().length() > other.getSex().length()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Spectator{");
        sb.append("name='").append(name).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", whiskers=").append(whiskers);
        sb.append(", broach=").append(broach);
        sb.append('}');
        return sb.toString();
    }

}
