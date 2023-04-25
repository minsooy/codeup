package com.likelion.codeup.week2.day2;

import java.util.Scanner;

public class q1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input[] = sc.nextLine().split("");
        int tTHou = Integer.parseInt(input[0])*10000;
        int thou = Integer.parseInt(input[1])*1000;
        int hund = Integer.parseInt(input[2])*100;
        int tens = Integer.parseInt(input[3])*10;
        int ones = Integer.parseInt(input[4])*1;

        System.out.printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]\n",tTHou,thou,hund,tens,ones);
    }
}
