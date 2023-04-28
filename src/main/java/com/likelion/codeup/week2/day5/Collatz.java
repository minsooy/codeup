package com.likelion.codeup.week2.day5;

public class Collatz {
    public int solution(int num) {
        int answer = 0;

        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }
            else{
                num *= 3;
                num ++;
            }
            answer ++;

            if(answer > 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }

}
