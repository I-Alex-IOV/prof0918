package com.vertex.homework3.homework4;

import com.vertex.homework3.Lissiner;

import java.util.ArrayList;
import java.util.Collections;

public class ListenerCreatorLinkedContainer {
    public LinkedContainer<Lissiner >createListOfListenerInList( ArrayList<Lissiner> lissinerArrayList) throws NoSuchFieldException, IllegalAccessException {
        Collections.shuffle(lissinerArrayList);
        LinkedContainer<Lissiner>lissinerLinkedContainer=new LinkedContainer<>();
        ReflectionHack reflectionHack = new ReflectionHack();
        reflectionHack.hack();
        System.out.println( "SizeMumberOfBrooches  "+LinkedContainer.getSizeMumberOfBrooches());
        System.out.println( "SizeMustacheLength  "+LinkedContainer.getSizeMustacheLength());
        LinkedContainer<Lissiner>linkedContainerMan=new LinkedContainer<>();
        LinkedContainer<Lissiner>linkedContainerWoman = new LinkedContainer<>();

        for (int i = 0; i <lissinerArrayList.size() ; i++) {
            if(lissinerArrayList.get(i).getSex().equals("man")){
                linkedContainerMan.addFirst(lissinerArrayList.get(i));
                if(lissinerArrayList.get(i).getMustacheLength()==LinkedContainer.getSizeMustacheLength())
                    try {
                        throw new TooShortMustashesException();
                    } catch (TooShortMustashesException e) {
                        e.getMessage();
                        System.out.println(lissinerArrayList.get(i)+" ---исключен из очереди");
                        lissinerArrayList.get(i).setName("----удален-----");
                        lissinerArrayList.get(i).setSex("");

                    }

            }else {
                linkedContainerWoman.addFirst(lissinerArrayList.get(i));
                if(lissinerArrayList.get(i).getNumberOfBrooches()==LinkedContainer.getSizeMumberOfBrooches())
                    try {
                        throw new LackOfBroochesException();
                    } catch (LackOfBroochesException e) {
                        e.getMessage();
                        System.out.println(lissinerArrayList.get(i)+" ---исключен из очереди");
                        lissinerArrayList.get(i).setName("----удален-----");
                        lissinerArrayList.get(i).setSex("");

                    }
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i <linkedContainerMan.size() ; i++) {
            lissinerLinkedContainer.addFirst(linkedContainerWoman.getElementBuIndex(i));
            lissinerLinkedContainer.addLast(linkedContainerMan.getElementBuIndex(i));
        }
        return lissinerLinkedContainer;
    }
    public void print( LinkedContainer<Lissiner>lissinerLinkedContainer){
        for(var a :lissinerLinkedContainer){
            System.out.println(a.toString());
        }
    }
}
