package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input >= 90){
            System.out.println("A");
        } else if(input >= 70){
            System.out.println("B");
        } else if(input >= 40){
            System.out.println("C");
        } else{
            System.out.println("D");
        }

    }
}
