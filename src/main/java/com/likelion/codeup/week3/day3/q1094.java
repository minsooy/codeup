package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] call = sc.nextLine().split(" ");
        int[] answer = new int[num];
        int temp = 0;

        for (int i = num-1; i >= 0; i--) {
            System.out.println(call[i]);

        }

    }
}
