package com.likelion.codeup.week3.day3;

import java.util.Scanner;

import static java.lang.Math.pow;

public class q1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int gap = sc.nextInt();
        int num =sc.nextInt();
        long answer = (long) (start * pow(gap, num-1));

        System.out.println(answer);
    }

}
