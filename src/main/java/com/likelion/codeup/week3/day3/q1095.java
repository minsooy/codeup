package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] call = sc.nextLine().split(" ");
        int min = 23;

        for (int i = 0; i < num; i++) {
            if(min > Integer.parseInt(call[i])){
                min = Integer.parseInt(call[i]);
            }
            System.out.println(min);
        }

        System.out.println(min);
    }
}
