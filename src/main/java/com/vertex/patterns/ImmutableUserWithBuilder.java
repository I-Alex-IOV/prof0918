package com.vertex.patterns;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImmutableUserWithBuilder {

    private String name;
    private String secondName;
    private int age;
    private Set<ImmutableUserWithBuilder> parents;

    public ImmutableUserWithBuilder(String name, String secondName, int age, Set<ImmutableUserWithBuilder> parents) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.parents = parents;
    }

    private ImmutableUserWithBuilder() {}

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Stream<ImmutableUserWithBuilder> getParents() {
        return parents != null? parents.stream() : Stream.empty();
    }

    public static class Builder {
        private ImmutableUserWithBuilder user;

        public Builder(){
            user = new ImmutableUserWithBuilder();
        }

        public Builder withName(String name){
            user.name = name;
            return this;
        }

        public Builder withSecondName(String secondName){
            user.secondName= secondName;
            return this;
        }

        public Builder withAge(int age){
            user.age = age;
            return this;
        }

        public Builder withParents(Set<ImmutableUserWithBuilder> parents){
            user.parents = parents;
            return this;
        }

        public ImmutableUserWithBuilder build() {
            return new ImmutableUserWithBuilder(user.name, user.secondName, user.age, user.parents);
//            return user;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ImmutableUserWithBuilder{");
        sb.append("name='").append(name).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", parents=").append(parents);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Builder builder = new Builder()
                .withAge(52)
                .withName("Michael")
                .withSecondName("Jordan");
        ImmutableUserWithBuilder user = builder
                .build();

        System.out.println(user);

        ImmutableUserWithBuilder otherUser = builder.withAge(22).build();

        System.out.println(otherUser);
        System.out.println(user);
    }
}
