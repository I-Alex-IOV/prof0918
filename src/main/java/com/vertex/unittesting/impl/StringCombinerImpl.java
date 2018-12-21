package com.vertex.unittesting.impl;

import com.vertex.unittesting.StringCombiner;
import com.vertex.unittesting.StringMathUtil;

public class StringCombinerImpl implements StringCombiner {

    private StringMathUtil stringMathUtil;

    public StringCombinerImpl(StringMathUtil stringMathUtil) {
        this.stringMathUtil = stringMathUtil;
    }

    @Override
    public String combine(String first, String second) {
        StringBuilder result = null;

        if (first != null && second != null) {
            result = new StringBuilder();

            char[] firstChars = first.toCharArray();
            char[] secondChars = second.toCharArray();

            int minLength = stringMathUtil.getMinLength(first, second);

            for (int i = 0; i < minLength; i++) {
                result.append(firstChars[i]);
                result.append(secondChars[i]);
            }

            result.append(first.substring(minLength));
            result.append(second.substring(minLength));

        }

        return result == null ? null : result.toString();
    }
}
