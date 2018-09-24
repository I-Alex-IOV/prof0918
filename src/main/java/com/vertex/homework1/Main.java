package com.vertex.homework1;

import com.vertex.homework1.markerFactory.MarkerTypes;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        // TODO: 24.09.2018 since wrong naming now it is not clear why do we are getting Market two times in a row 
        teacher.writeText(teacher.getMarker().getMarker(MarkerTypes.RED), "Красный текст");
        teacher.writeText(teacher.getMarker().getMarker(MarkerTypes.BLACK), "Черный текст");
        teacher.writeText(teacher.getMarker().getMarker(MarkerTypes.GREEN), "Зеленый текст");
    }
}
