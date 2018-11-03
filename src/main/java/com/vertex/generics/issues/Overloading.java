package com.vertex.generics.issues;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sweet_home on 04.03.17.
 */
public class Overloading<T extends String, U extends Byte> {

    public void myMethod(T t) {
        System.out.println(t);
    }

    public void myMethod(U u) {
        System.out.println(u);
    }


    public static void main(String[] args) {
        List<? extends RuntimeException> exceptions = new ArrayList<>();
        RuntimeException runtimeException = exceptions.get(0);
    }
}
