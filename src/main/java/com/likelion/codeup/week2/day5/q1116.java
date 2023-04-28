package com.likelion.codeup.week2.day5;

import java.util.Scanner;

public class q1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.printf("%d+%d=%d", val1, val2, val1 + val2);
        System.out.printf("%d-%d=%d", val1, val2, val1 - val2);
        System.out.printf("%d*%d=%d", val1, val2, val1 * val2);
        System.out.printf("%d/%d=%d", val1, val2, val1 / val2);
    }
}
