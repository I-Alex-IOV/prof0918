package com.vertex.unittesting.impl;

import com.vertex.unittesting.StringMathUtil;

public class StringMathUtilImpl implements StringMathUtil {
    @Override
    public int getMinLength(String first, String second) {
        return Math.min(first.length(), second.length());
    }
}
