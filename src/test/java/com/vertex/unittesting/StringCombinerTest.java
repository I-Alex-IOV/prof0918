package com.vertex.unittesting;

import com.vertex.unittesting.impl.StringCombinerImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StringCombinerTest {

    @Mock
    private StringMathUtil stringMathUtil;

    @InjectMocks
    private StringCombinerImpl underTest;

    @Test
    public void sanityCheckTest() {
        String expected = "adbecf";

        when(stringMathUtil.getMinLength(anyString(), anyString())).thenReturn(3);

        String actualResult = underTest.combine("abc", "def");

        assertEquals("Implementation is wrong", expected, actualResult);
    }

    @Test
    public void sanityCheckWithEmptyStringsTest() {
        String expected = "";
        String actualResult = underTest.combine("", "");

        assertEquals("Implementation is wrong", expected, actualResult);
    }

    @Test
    public void checkWithNullFirstStringTest() {
        String expected = null;
        String actualResult = underTest.combine(null, "any");

        assertEquals("Implementation is wrong", expected, actualResult);
    }

    @Test
    public void checkWithNullSecondStringTest() {
        String expected = null;
        String actualResult = underTest.combine("any", null);

        assertEquals("Implementation is wrong", expected, actualResult);
    }

    @Test
    public void checkWithAllNullStringTest() {
        String expected = null;
        String actualResult = underTest.combine(null, null);

        assertEquals("Implementation is wrong", expected, actualResult);
    }

    @Test
    public void checkWithDifferentLengthStringTest() {
        String expected = "alnoynger";
        when(stringMathUtil.getMinLength(anyString(), anyString())).thenReturn(3);

        String actualResult = underTest.combine("any", "longer");

        assertEquals("Implementation is wrong", expected, actualResult);
    }

    @Test
    public void checkMinLengthWasCalled() {
        String first = "any";
        String second = "longer";

        underTest.combine(first, second);

        verify(stringMathUtil).getMinLength(first, second);
    }
}