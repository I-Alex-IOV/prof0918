package com.vertex.homework1;

import com.vertex.homework1.markerFactory.MarkerTypes;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.writeText(teacher.getMarker().getMarker(MarkerTypes.RED), "Красный текст");
        teacher.writeText(teacher.getMarker().getMarker(MarkerTypes.BLACK), "Черный текст");
        teacher.writeText(teacher.getMarker().getMarker(MarkerTypes.GREEN), "Зеленый текст");
    }
}
