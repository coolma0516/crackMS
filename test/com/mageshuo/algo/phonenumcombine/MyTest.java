package com.mageshuo.algo.phonenumcombine;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void defaultTest() {
        Solution tester = new Solution();
        String digits = "23";
        String[] arr = new String[]{"ad","ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        List<String> list = Arrays.asList(arr);
        assertEquals(list, tester.letterCombinations(digits));
    }
}
