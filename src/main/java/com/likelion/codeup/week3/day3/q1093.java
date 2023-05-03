package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] call = sc.nextLine().split(" ");
        int[] answer = new int[23];

        for (int i = 0; i < Integer.parseInt(num); i++) {
            answer[Integer.parseInt(call[i])-1] ++;
        }

        for (int i = 0; i < 23; i++) {
            System.out.printf("%d ", answer[i]);
        }
    }
}
