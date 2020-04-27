package com.mageshuo.lcof.repeatednumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void defaultTest() {
        Solution tester = new Solution();
        int[] arr = new int[] {2, 3, 1, 0, 2, 5, 3};
        assertEquals(2, tester.findRepeatedNumber(arr));
    }
}
