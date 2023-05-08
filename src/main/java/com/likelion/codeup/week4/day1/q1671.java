package com.likelion.codeup.week4.day1;

import java.util.Scanner;

public class q1671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        int opponent = sc.nextInt();
        if(player == 0 && opponent == 1){
            System.out.println("win");
        }else if(player == 1 && opponent ==2){
            System.out.println("win");
        } else if (player == 2 && opponent == 0) {
            System.out.println("win");
        } else if (player == opponent) {
            System.out.println("tie");
        }else{
            System.out.println("lose");
        }
    }
}
