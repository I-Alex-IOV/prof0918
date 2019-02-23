package com.vertex.arrays;

import java.util.*;

public class Test1 {

    // Complete the maxDifference function below.
    public static List<Integer> cutSticks(List<Integer> lengths) {
        Collections.sort(lengths);

        System.out.println(lengths);

        List<Integer> result = new ArrayList<>();
        result.add(lengths.size());

        Integer temp = lengths.get(0);

        Iterator<Integer> iterator = lengths.iterator();
        while (iterator.hasNext()) {
            Integer stick = iterator.next();
            if (temp.equals(stick)) {
                iterator.remove();
            } else {
                result.add(lengths.size());
                iterator.remove();
                temp = stick;
            }
        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(cutSticks(new ArrayList<>(Arrays.asList(6,
                5,
                4,
                4,
                2,
                2,
                8))));

    }
}
