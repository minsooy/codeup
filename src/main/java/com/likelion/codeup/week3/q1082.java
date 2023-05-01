package com.likelion.codeup.week3;

import java.util.Scanner;

public class q1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = Integer.parseInt(sc.next(), 16);

        for (int i = 1; i <= 15; i++) {
            System.out.printf("%X*%X=%X\n", val, i, val * i);
        }
    }
}
