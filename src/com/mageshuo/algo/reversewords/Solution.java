package com.mageshuo.algo.reversewords;

public class Solution {
        public String reverseWords(String s) {
            StringBuilder sb = new StringBuilder();
            String[] arr = s.split(" ");

            for(int i = arr.length - 1; i >= 1; i--) {
                sb.append(arr[i]).append(" ");
            }
            sb.append(arr[0]);
            return sb.toString();
        }
}
