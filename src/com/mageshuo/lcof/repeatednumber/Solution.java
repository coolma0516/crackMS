package com.mageshuo.lcof.repeatednumber;

import java.util.HashSet;
import java.util.Set;


public class Solution {
    public int findRepeatedNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for(int num: nums) {
            if(!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
}
