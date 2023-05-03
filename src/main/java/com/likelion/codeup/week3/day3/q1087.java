package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int add = 1;
        int sum = 0;
        while(sum < input){
            sum += add;
            add ++;
        }

        System.out.println(sum);

    }
}
