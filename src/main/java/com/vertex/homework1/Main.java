package com.vertex.homework1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Marker marker=new Marker();
        Teache teache = new Teache();
        teache.setName("иван");
        teache.setSurname("иванов");
        teache.setAge(34);
        teache.setExperience(10);
        teache.writeAndReadFile();
        teache.print(marker);

    }
}
