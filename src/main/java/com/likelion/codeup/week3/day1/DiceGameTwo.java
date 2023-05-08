package com.likelion.codeup.week3.day1;

public class DiceGameTwo {
    class Solution {
        int answer = 0;

        public int solution(int a, int b, int c) {
            if(a != b && b != c && c != a){
                answer = a + b + c;
            }

            if((a == b && a != c)|| (b == c && b != a) || (c == a && c != b) ){
                answer = (int) ((int) (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2)  + Math.pow(c, 2)));
            }

            if(a == b && b == c && c == a){
                answer = (int) (27 * Math.pow(a , 6));
            }

            return answer;
        }
    }
}
