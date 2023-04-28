package com.likelion.codeup.week2.day5;

import java.util.Scanner;

public class q1123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celcius = sc.nextInt();
        float farenheit = (float) (1.8 * celcius + 32);

        System.out.printf("%.3f", farenheit);
    }
}
