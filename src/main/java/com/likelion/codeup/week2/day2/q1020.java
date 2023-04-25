package com.likelion.codeup.week2.day2;

import java.util.Scanner;

public class q1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullNum = sc.nextLine();
        String idNum = fullNum.substring(0,6) + fullNum.substring(7,14);
        System.out.println(idNum);
    }
}
