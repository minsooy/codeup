package com.likelion.codeup.week2.day1;

import java.util.Scanner;

public class q1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String storage = sc.nextLine();
        String[] splitted = storage.split("\\.");
        System.out.println(splitted[0]);
        System.out.println(splitted[1]);


    }
}

