package com.likelion.codeup.week2.day4;

import java.util.Scanner;

public class q1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var1 = sc.nextInt();
        int var2 = sc.nextInt();

        System.out.printf("%d", var1 != var2 ? 1 : 0);
    }
}