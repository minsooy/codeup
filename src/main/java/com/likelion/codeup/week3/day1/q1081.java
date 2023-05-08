package com.likelion.codeup.week3.day1;

import java.util.Scanner;

public class q1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        for (int i = 1; i <= val1 ; i++) {
            for (int j = 1; j <= val2; j++) {
                System.out.printf("%d %d\n" ,i, j);
            }
        }
    }
}
