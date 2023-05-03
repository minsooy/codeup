package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1072DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        int count = 0;

        do{
            System.out.println(arr[count]);
            count++;
        }while (count < index);
    }
}
