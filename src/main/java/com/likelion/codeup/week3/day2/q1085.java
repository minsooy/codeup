package com.likelion.codeup.week3.day2;

import java.util.Scanner;


public class q1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        float mb = (float) n1 * n2 * n3 * n4 / 1024 / 1024 /8;

        System.out.printf("%.1f MB" , mb);

    }
}
