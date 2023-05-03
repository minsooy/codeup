package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");

        for (int i = 0; i < input.length; i++) {
            System.out.printf("\'%s\'\n", input[i]);
        }
    }
}
