package com.likelion.codeup.week2.day2;

import java.util.Scanner;

public class q1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenNum[] = sc.nextLine().split(" ");
        long val1 = Long.parseLong(givenNum[0]);
        long val2 = Long.parseLong(givenNum[1]);
        System.out.println(val1+val2);
    }
}
