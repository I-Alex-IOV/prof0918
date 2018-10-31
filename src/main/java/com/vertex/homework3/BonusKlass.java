package com.vertex.homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class BonusKlass {
    public HashSet<Lissiner> gettingAListForABonus(HashMap<Ticket, Lissiner> ticketLissinerMap) {
        ArrayList<Lissiner> valuesFromMap = new ArrayList<>();
        ticketLissinerMap.values().stream()
                .forEach(valuesFromMap::add);

        ArrayList<Lissiner> lissinersWhoBoughtMoreThanOne = new ArrayList<>();

        for (int i = 0; i < valuesFromMap.size(); i++) {
            int purchaseCounter = 0;
            Lissiner lissiner = valuesFromMap.get(i);
            for (int j = 0; j < valuesFromMap.size(); j++) {

                if (lissiner.equals(valuesFromMap.get(j))) {
                    purchaseCounter++;
                    if (purchaseCounter >= 2) {
                        lissinersWhoBoughtMoreThanOne.add(lissiner);
                    }
                }

            }

        }
        HashSet<Lissiner> hashSetlissinersWhoBoughtMoreThanOne = new HashSet<>(lissinersWhoBoughtMoreThanOne);
        return hashSetlissinersWhoBoughtMoreThanOne;

    }

    public void announcementOfTheListAndBonus(HashSet<Lissiner> hashSetlissinersWhoBoughtMoreThanOne) {
        System.out.println();
        System.out.println("Список посетителей имеющих право приобрести билеты на след концерт за 50% стоимости :");
        Iterator<Lissiner> iterator = hashSetlissinersWhoBoughtMoreThanOne.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        System.out.println( "Всего :"+hashSetlissinersWhoBoughtMoreThanOne.size());
    }
}

