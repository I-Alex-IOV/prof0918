package com.vertex.homework1;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;

    @Data
    public class Teache {
        private String name;
        private String surname;
        private int age;
        private int experience;
        private ArrayList<String> arrayList= new ArrayList<String>();
        public void writeAndReadFile () throws IOException {

            File file= new File("My file");
            Writer writer= null;
            try {
                writer = new BufferedWriter(new FileWriter(file));
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.write("Мой дядя самых честных правил когда не в шутку занемог он уважать себя заставил");
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedReader bufferedReader = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            String tmp="";
            assert bufferedReader != null;
            while ((tmp=bufferedReader.readLine())!=null) {
                String[] s = tmp.split(" ");
                for (var a : s) {
                    arrayList.add(a);
                }
            }
        }
        public void print (Marker marker) {
            System.out.print(marker.getRedStart());
            for (var a : arrayList) {
                System.out.print(" "+ a + " ");
            }
            System.out.println(marker.getRedEnd());
        }
    }

