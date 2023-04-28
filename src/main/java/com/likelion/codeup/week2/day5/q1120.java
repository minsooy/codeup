package com.likelion.codeup.week2.day5;

import java.util.Scanner;

public class q1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        int sum =val1 + val2 + val3;
        System.out.printf("%.2f", (float) sum / 3);

    }
}
