package com.vertex.collections;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {
        User.UserBuilder builder = new User.UserBuilder()
                .name("Semen")
                .surname("Olivkov")
                .age(20);

        User mam = new User.UserBuilder()
                .age(40)
                .name("Alevtina")
                .surname("Olivkova")
                .build();

        User dad = new User.UserBuilder()
                .age(43)
                .name("Onufriy")
                .surname("Olivkov")
                .build();

        List<User> parents = Arrays.asList(mam, dad);

        List<User> sons = Arrays.asList(
                builder.build(),
                builder.name("Mikhail").age(23).build(),
                builder.name("Alex").age(16).build()
        );

        Set<User> sonsWithParents = sons.stream()
                .map(son -> new User(son.name, son.surname, son.age, parents))
//                .peek(System.out::println)
                .collect(Collectors.toSet());

//        System.out.println();

//        sonsWithParents.stream()
//                .filter(son -> son.age >= 20)
//                .peek(System.out::println)
//                .filter(son -> son.name.startsWith("S"))
//                .forEach(System.out::println);

        DoubleStream doubleStream = sonsWithParents.stream().parallel()
                .flatMap(son -> Stream.concat(Stream.of(son), son.parents.stream()))
                .distinct()
                .mapToDouble(User::getAge);

//        double reduce = doubleStream
//                .average()
//                .reduce(8, (left, right) -> left + right);

        doubleStream
                .reduce((a, b) -> a + b)
                .ifPresent(System.out::println);

        doubleStream.forEach(System.out::println);

        Object reduce1 = DoubleStream.empty()
                .reduce(0, (a, b) -> a + b);

        System.out.println(reduce1);

    }

    @Data
    @Builder
    @AllArgsConstructor
    private static class User {
        private String name;
        private String surname;
        private int age;
        private List<User> parents;
    }
}
