package com.likelion.codeup.week3.day2;

import java.util.Scanner;

public class q1620 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        int digitSum = 0;
        while (input > 0){
            digitSum += input % 10;
            input /= 10;

            if (input == 0 && digitSum >= 10){
                input = digitSum;
                digitSum = 0;
            }
            System.out.println(input);
            System.out.println(digitSum);
        }
        System.out.println(digitSum);
    }
}
