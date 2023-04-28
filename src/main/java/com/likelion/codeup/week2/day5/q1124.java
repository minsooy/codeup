package com.likelion.codeup.week2.day5;

import java.util.Scanner;

public class q1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] equation = sc.nextLine().substring(1).split("H");

        int carbon = Integer.parseInt(equation[0]);
        int hydrogen = Integer.parseInt(equation[1]);

        System.out.println(carbon * 12 + hydrogen);

    }
}
