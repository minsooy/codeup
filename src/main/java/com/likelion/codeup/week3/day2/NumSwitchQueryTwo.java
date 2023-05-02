package com.likelion.codeup.week3.day2;

public class NumSwitchQueryTwo {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];


        for (int i = 0; i < queries.length; i++) {
            int val = -1;
            for (int j = queries[i][0]; j <= queries[i][1] ; j++) {
                if (arr[j] > queries[i][2]){
                    if (val == -1){
                        val = arr[j];
                    } else if (arr[j] < val  ) {
                        val = arr[j];
                    }
                }
            }
            answer[i] = val;
        }

        return answer;
    }
}
