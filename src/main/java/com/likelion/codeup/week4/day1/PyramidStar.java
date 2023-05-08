package com.likelion.codeup.week4.day1;

import java.util.Scanner;

public class PyramidStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();

        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < idx - i  ; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
