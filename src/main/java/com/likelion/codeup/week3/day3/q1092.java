package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int date = 1;

        while (true){
            if(date % n1 == 0 && date % n2 == 0 && date % n3 == 0){
                System.out.println(date);
                break;
            }
            date++;
        }
    }
}
