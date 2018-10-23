package com.vertex.collections;

import com.vertex.patterns.ImmutableUser;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.emptySet;

public class ComputeExperiments {

    public static void main(String[] args) {
        Map<String, ImmutableUser> map = new HashMap<>();

        ImmutableUser immutableUser = new ImmutableUser("Tolik", "NeVajno", 100, emptySet());
        map.put("first", immutableUser);
        map.put("nullKey", null);
        map.put(null, null);

        System.out.println(map);

        System.out.println(map.computeIfPresent("first", (key, value) -> value.setSecondName(key)));
        System.out.println(map.computeIfPresent("nullKey", (key, value) -> value));
        System.out.println(map.computeIfPresent("second", (key, value) -> value));

        System.out.println(map);
        System.out.println(map.compute("first", (key, value) -> value != null ? value.setName(key) : value));
        System.out.println(map.compute("nullKey", (key, value) -> value));
//        System.out.println(map.compute(null, (key, value) -> value));
        System.out.println(map.compute("second", (key, value) -> value));

        System.out.println(map);

//        System.out.println(map.computeIfAbsent("first", key -> new ImmutableUser("Tolik", key, 100, new HashSet<>())));
//        System.out.println(map.computeIfAbsent("null", key -> new ImmutableUser("Tolik", key, 100, new HashSet<>())));
//        System.out.println(map.computeIfAbsent("second", key -> new ImmutableUser("Tolik", key, 100, new HashSet<>())));

        System.out.println(map);

        System.out.println(map.merge("first", immutableUser, (value1, value2) -> value1.setName("test")));
        System.out.println(map.merge("nullKey", immutableUser, (value1, value2) -> value2.setName("test2")));
        System.out.println(map.merge(null, immutableUser, (value1, value2) -> value2.setName("test3")));

        System.out.println(map);


        Comparator.comparing(ImmutableUser::getAge)
                .thenComparing(ImmutableUser::getName);
    }


}
