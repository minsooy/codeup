package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int gap = sc.nextInt();
        int num =sc.nextInt();

        System.out.println(start + gap*(num-1));
    }

}
