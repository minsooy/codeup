package com.likelion.codeup.week2.day2;

import java.util.Scanner;

public class q1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenTime[] = sc.nextLine().split(":");
        System.out.printf("%s:%s",givenTime[0],givenTime[1]);
    }
}
