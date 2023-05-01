package com.likelion.codeup.week3;

import java.util.Scanner;

public class q1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        int evenSum = 0;

        for (int i = 0; i <= end ; i++) {
            if (i % 2 == 0){
                evenSum += i;
            }
        }
        System.out.println(evenSum);
    }
}