package com.likelion.codeup.week2.day4;

public class TreasureMap {
    class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] map = new String[n];

            for(int i = 0; i < n;  i++){

                map[i] = String.format("%" + n + "s",
                        Integer.toBinaryString(arr1[i] | arr2[i]))
                        .replace("1" , "#")
                        .replace("0" , " ");
            }
            return map;
        }
    }

}
