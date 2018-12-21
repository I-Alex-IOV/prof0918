package com.vertex.unittesting;

import com.vertex.unittesting.impl.StringMathUtilImpl;
import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

public class StringMathUtilTest {

    private StringMathUtil underTest = new StringMathUtilImpl();

    @Test(expected = NullPointerException.class)
    public void checkForNullArguments() {
        underTest.getMinLength(null, null);
        fail("NullPointerException was expected");
    }

    @Test
    public void sanityCheckTest() {
        int actual = underTest.getMinLength("qwert", "qwe");
        assertSame("Realisation is wrong", 3, actual);
    }

    @Test
    public void sanityCheckTestWithOtherArgs() {
        int actual = underTest.getMinLength("ee", "bbbbbb");
        assertSame("Realisation is wrong", 2, actual);
    }

    @Test

    public void sanityCheckWithEmptyArgTest() {
        int actual = underTest.getMinLength("", "qqqq");
        assertSame("Realisation is wrong", 0, actual);
    }

}