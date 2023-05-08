package com.likelion.codeup.week3.day1;

public class ZeroAndFive {
    public int[] solution(int l, int r) {
        int[] answer = new int[(r - l) / 5];
        int index =0;

        for (int i = l; i <= r ; i++) {
            boolean flag = true;
            int quo = i;

            while (quo != 0){
                if (quo % 5 != 0){
                    flag = false;
                    break;
                }
                else{
                  quo /= 10;
                }
            }
            if (flag){
                answer[index] = i;
                index ++;
            }
        }
        if (index == 0){
            answer = new int[]{-1};
        }
        else{
            int[] temp = answer;
            answer = new int[index];
            for (int i = 0; i < index; i++) {
                answer[i] = temp[i];
            }
        }
        return answer;
    }
}
