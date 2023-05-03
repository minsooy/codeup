package com.likelion.codeup.week3.day3;

import java.util.ArrayList;

public class PrimeFacto {

    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            if(n % i ==0){
                while (n % i ==0){
                    n /= i;
                }
                answer.add(i);
            }
        }

        int[] answerArr = answer.stream().mapToInt(i -> i).toArray();
        return answerArr;
    }
}
