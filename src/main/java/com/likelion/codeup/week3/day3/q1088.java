package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i <= input ; i++) {

            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
