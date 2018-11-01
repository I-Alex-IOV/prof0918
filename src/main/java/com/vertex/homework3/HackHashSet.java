package com.vertex.homework3;

import java.util.ArrayList;
import java.util.HashSet;

public class HackHashSet {
    public void Hacking(HashSet<Lissiner> hashSetlissinersWhoBoughtMoreThanOne) {
        ArrayList<Lissiner> lissinerArrayListFalse = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            lissinerArrayListFalse.add(new Lissiner("11111" + i, "123" + i, i));
        }
        for (int i = 0; i < lissinerArrayListFalse.size(); i++) {
            hashSetlissinersWhoBoughtMoreThanOne.add(lissinerArrayListFalse.get(i));


            ArrayList<Lissiner> arrayList = new ArrayList<>(hashSetlissinersWhoBoughtMoreThanOne);

            for (int j = 0; j < arrayList.size(); j++) {
                lissinerArrayListFalse.get(i).setName(arrayList.get(0).getName());
                lissinerArrayListFalse.get(i).setSex(arrayList.get(0).getSex());
                lissinerArrayListFalse.get(i).setMustacheLength(arrayList.get(0).getMustacheLength());
                lissinerArrayListFalse.get(i).setNumberOfBrooches(arrayList.get(0).getNumberOfBrooches());
            }


        }
    }
}
