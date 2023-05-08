package com.likelion.codeup.week4.day1;

import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();

        for (int i = 1; i <= idx; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
