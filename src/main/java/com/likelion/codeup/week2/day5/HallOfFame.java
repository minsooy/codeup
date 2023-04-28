package com.likelion.codeup.week2.day5;

import java.util.ArrayList;
import java.util.Collections;


public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> fame = new ArrayList<>();
        for (int i =0; i < score.length; i++){
            if (fame.size() < k){
                fame.add(score[i]);
                Collections.sort(fame);
                answer[i] = fame.get(0);
            }
            else {
                fame.add(score[i]);
                Collections.sort(fame);
                fame.remove(0);
                answer[i] = fame.get(0);
            }

        }
        return answer;

    }
}
