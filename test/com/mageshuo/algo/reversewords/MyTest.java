package com.mageshuo.algo.reversewords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void defaultTest() {
        Solution tester = new Solution();
        String str = "the sky is blue";
        assertEquals("blue is sky the", tester.reverseWords(str));
        String str2 = "  hello world!  ";
        assertEquals("world! hello", tester.reverseWords(str2));
        String str3 = "a good   example";
        assertEquals("example good a", tester.reverseWords(str3));
    }


}
