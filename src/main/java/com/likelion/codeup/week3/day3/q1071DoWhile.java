package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1071DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int idx = 0;

        do {
            System.out.println(arr[idx]);
            idx ++;
        }while(Integer.parseInt(arr[idx]) != 0);
    }
}
