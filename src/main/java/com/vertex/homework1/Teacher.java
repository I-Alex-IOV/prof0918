package com.vertex.homework1;

public class Teacher {
    String name;
    Integer age;
    String text;
    Marker marker;

    public Teacher(String name, Integer age, String text, Marker marker) {
        this.name = name;
        this.age = age;
        this.text = text;
        this.marker=marker;
    }
    public int checkTextLength(){
        String[] textLength=getText().split(" ");

        int res=0;
        for (int i=0;i<textLength.length;i++){
            res=res+textLength[i].length();
        }
        return res;
    }

    public void toWrite(){
        if (checkTextLength()<100){
            System.out.println("<"+marker.getColor()+">"+getText()+"</"+marker.getColor()+">");
        }
        else {
            System.out.println("ooops.You need to take a new one marker");
        }

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getText() {
        return text;
    }

}
