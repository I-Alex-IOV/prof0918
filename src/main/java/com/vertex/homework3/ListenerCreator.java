package com.vertex.homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListenerCreator {
    private List<String>listOfMan;
    private List<String>listOfWoman;
    private  int marker;

    public void createListNamesMan() {
        listOfMan =Stream.of(
                "Абрам",
                "Аваз",
                "Аввакум",
                "Август",
                "Августин",
                "Авдей",
                "Авраам",
                "Автандил",
                "Агап",
                "Агафон",
                "Аггей",
                "Адам",
                "Адис",
                "Адольф",
                "Адриан",
                "Азамат",
                "Айдар",
                "Айнур",
                "Айрат",
                "Аким",
                "Алан",
                "Алей",
                "Александр",
                "Алексей",
                "Али",
                "Альберт"
        ).collect(Collectors.toList());
        marker=listOfMan.size();


    }

    public List<String> getListOfMan() {
        return listOfMan;
    }

    public void setListOfMan(List<String> listOfMan) {
        this.listOfMan = listOfMan;
    }

    public List<String> getListOfWoman() {
        return listOfWoman;
    }

    public void setListOfWoman(List<String> listOfWoman) {
        this.listOfWoman = listOfWoman;
    }

    public int getMarker() {
        return marker;
    }

    public void setMarker(int marker) {
        this.marker = marker;
    }


    public void createListNamesWoman() {

        listOfWoman = Stream.of("Валентина",
                "Валерия",
                "Ванда",
                "Ванесса",
                "Варвара",
                "Василиса",
                "Венера",
                "Вера",
                "Верона",
                "Вероника",
                "Версавия",
                "Веселина",
                "Весняна",
                "Веста",
                "Вида",
                "Виктория",
                "Вилора",
                "Виолетта",
                "Виоланта",
                "Виргиния",
                "Винетта",
                "Виталина",
                "Влада",
                "Владислава",
                "Владлена",
                "Властилина").collect(Collectors.toList());

    }

    public ArrayList<Lissiner> createListOfListener() {
        ArrayList<Lissiner> lissinerArrayListWoman = new ArrayList<>();
        for (int i = 0; i < marker; i++) {
            lissinerArrayListWoman.add(new Lissiner(listOfWoman.get(i), "woman", i));
        }
        lissinerArrayListWoman.sort(Lissiner.comparator);

        ArrayList<Lissiner> lissinerQueueMan = new ArrayList<>();
        for (int i = 0; i < marker; i++) {
            lissinerQueueMan.add(new Lissiner(listOfMan.get(i), "man", (double) i));
        }
        lissinerQueueMan.sort(Lissiner.comparator1);

        ArrayList<Lissiner>  lissinerArrayList =  new ArrayList<>();
        for (int i = 0; i < lissinerArrayListWoman.size(); i++) {
            lissinerArrayList.add(lissinerArrayListWoman.get(i));
            System.out.println(lissinerArrayListWoman.get(i).toString()+"in the qeue");
        }
        for (int i = 0; i <lissinerArrayListWoman.size() ; i++) {
            lissinerArrayList.add(lissinerQueueMan.get(i));
            System.out.println(lissinerQueueMan.get(i).toString()+"in the qeue");
        }
        System.out.println();
        return lissinerArrayList;
    }
}

