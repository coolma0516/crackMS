package com.mageshuo.algo.reversewords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void stringReversed() {
        Solution tester = new Solution();
        String str = new String("the sky is blue");
        assertEquals("blue is sky th", tester.reverseWords(str));
    }
}
