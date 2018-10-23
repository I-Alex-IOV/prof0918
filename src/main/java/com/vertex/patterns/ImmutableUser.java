package com.vertex.patterns;

import lombok.ToString;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ToString
public class ImmutableUser {

    private String name;
    private String secondName;
    private int age;
    private Set<ImmutableUser> parents;

    public ImmutableUser(String name, String secondName, int age, Set<ImmutableUser> parents) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.parents = parents;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Stream<ImmutableUser> getParents() {
        return parents.stream();
    }

    public ImmutableUser setName(String name) {
        return new ImmutableUser(name, this.secondName, this.age, getParents().collect(Collectors.toSet()));
    }

    public ImmutableUser setSecondName(String secondName) {
        return new ImmutableUser(this.name, secondName, this.age, getParents().collect(Collectors.toSet()));
    }

    public ImmutableUser setAge(int age) {
        return new ImmutableUser(this.name, this.secondName, age, getParents().collect(Collectors.toSet()));
    }

    public ImmutableUser setParents(Set<ImmutableUser> parents) {
        return new ImmutableUser(this.name, this.secondName, this.age, parents);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImmutableUser user = (ImmutableUser) o;

        if (age != user.age) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return secondName != null ? secondName.equals(user.secondName) : user.secondName == null;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    public static void main(String[] args) {

        ImmutableUser user = new ImmutableUser("Michael", "Shumacher", 42, new HashSet<>());

        System.out.println(user);

        ImmutableUser brother = user.setName("Ralph");

        System.out.println(brother);
        System.out.println(user == brother);

    }

}
