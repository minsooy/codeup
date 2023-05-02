package com.likelion.codeup.week3.day2;

import java.util.Scanner;

public class q1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if(i % 3 == 0){
                System.out.printf("X ");
            }
            else{
                System.out.printf("%d ", i);
            }
        }
    }
}
