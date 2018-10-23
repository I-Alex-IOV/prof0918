package com.vertex.arrays;

import com.vertex.patterns.ImmutableUserWithBuilder;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExamples {

    public static void main(String[] args) {
        ImmutableUserWithBuilder[] users = {
                new ImmutableUserWithBuilder.Builder()
                        .withName("name")
                        .withSecondName("name")
                        .withAge(19)
                        .build(),
                new ImmutableUserWithBuilder.Builder()
                        .withAge(20)
                        .withName("name")
                        .withSecondName("aname")
                        .build(),
                new ImmutableUserWithBuilder.Builder()
                        .withName("wname")
                        .withSecondName("aname")
                        .withAge(10)
                        .build()
        };


        System.out.println(Arrays.toString(users));

        Arrays.sort(users, new Comparator<ImmutableUserWithBuilder>() {
            @Override
            public int compare(ImmutableUserWithBuilder left, ImmutableUserWithBuilder right) {
                return left.getAge() > right.getAge() ? 1 : left.getAge() == right.getAge() ? 0 : -1;
            }
        });

        System.out.println(Arrays.toString(users));

        Arrays.sort(users, Comparator
                .comparing(ImmutableUserWithBuilder::getName)
                .thenComparing(ImmutableUserWithBuilder::getAge));

        System.out.println(Arrays.toString(users));

        for (ImmutableUserWithBuilder user : users) {
            System.out.println(user);
        }

    }
}

