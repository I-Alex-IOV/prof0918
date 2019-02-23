package com.vertex.reflection.staticfields;

import java.util.Calendar;

public class WithStaticFields {

    public static final String TEST = getTest();

    private static String getTest() {
        System.out.println("init withStaticFields");
        return "test" + Calendar.getInstance().toString();
    }


}
