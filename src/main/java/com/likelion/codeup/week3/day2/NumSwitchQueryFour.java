package com.likelion.codeup.week3.day2;

public class NumSwitchQueryFour {
    public int[] solution(int[] arr, int[][] queries) {

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] == 0){
                    arr[j] ++;
                }
            }
        }
        
        
        return arr;
    }
}
