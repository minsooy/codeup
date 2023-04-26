package com.likelion.codeup.week2.day3;

import java.util.Scanner;

public class q1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        long numSum = (long) val1 + val2 + val3;
        float numAvr = (float) numSum / 3;

        System.out.printf("%d\n%.1f",numSum,numAvr);
    }
}
