package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        int multiplier = sc.nextInt();
        int addition = sc.nextInt();
        int num = sc.nextInt();

        for (int i = 0; i < num-1; i++) {
            start = start * multiplier + addition;
        }

        System.out.println(start);
    }
}
