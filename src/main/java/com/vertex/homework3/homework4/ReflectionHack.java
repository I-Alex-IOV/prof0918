package com.vertex.homework3.homework4;

import com.vertex.homework3.Lissiner;

import java.lang.reflect.Field;

public class ReflectionHack {
    public void hack() throws IllegalAccessException, NoSuchFieldException {
        LinkedContainer<Lissiner>lissinerLinkedContainer=new LinkedContainer<>();
        Class<? extends LinkedContainer> linkedContainerClass=lissinerLinkedContainer.getClass();

        Field field=linkedContainerClass.getDeclaredField("sizeMustacheLength");
        field.setAccessible(true);
        field.setDouble(linkedContainerClass,-1.0);
        Field field1=linkedContainerClass.getDeclaredField("sizeMumberOfBrooches");
        field1.setAccessible(true);
        field1.setInt(linkedContainerClass,-1);

    }
}
