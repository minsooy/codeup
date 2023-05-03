package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime == true){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }

    }
}
