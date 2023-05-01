package com.likelion.codeup.week3;

import java.util.Scanner;

public class q1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int sum =0;

        for (int i = 0; ; i++) {
            sum += i;
            if (sum >= limit) {
                System.out.println(i);
                break;
            }
        }
    }
}
