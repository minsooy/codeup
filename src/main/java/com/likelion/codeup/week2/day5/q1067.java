package com.likelion.codeup.week2.day5;

import java.util.Scanner;

public class q1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();

        if(val1 < 0){
            System.out.println("minus");
        }
        else{
            System.out.println("plus");
        }

        if(val1 % 2 ==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

    }
}
