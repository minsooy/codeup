package com.likelion.codeup.week3.day1;

import java.util.Scanner;

public class q1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = sc.nextLine().split(" ");

        for (int i = 0; i <= list.length ; i++) {
            System.out.println(list[i]);

            if(list[i].equals("q")){
                break;
            }
        }
    }
}
