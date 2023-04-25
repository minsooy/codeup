package com.likelion.codeup.week2.day2;

import java.util.Scanner;

public class q1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenDate[] = sc.nextLine().split("\\.");
        int year = Integer.parseInt(givenDate[0]);
        int month = Integer.parseInt(givenDate[1]);
        int day = Integer.parseInt(givenDate[2]);

        System.out.printf("%04d.%02d.%02d",year,month,day);
    }
}
