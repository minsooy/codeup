package com.likelion.codeup.week3;


import static java.lang.Math.pow;

public class ConnectNum {
    public int solution(int[] num_list) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 ==-0){
                evenSum = evenSum * 10 + num_list[i];
            }
            else {
                oddSum = oddSum * 10 + num_list[i];
            }
        }


        return evenSum + oddSum;
    }
}
