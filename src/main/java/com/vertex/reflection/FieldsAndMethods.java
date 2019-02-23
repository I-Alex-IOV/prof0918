package com.vertex.reflection;

import com.vertex.patterns.ImmutableUser;

import java.lang.reflect.Field;
import java.util.Arrays;

public class FieldsAndMethods {

    public static void main(String[] args) {
        Class<ImmutableUser> immutableUserClass = ImmutableUser.class;

        Field[] declaredFields = immutableUserClass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

        System.out.println(Arrays.stream(declaredFields)
                .anyMatch(field -> "name".equals(field.getName())
                        && String.class.equals(field.getType())));
    }
}
