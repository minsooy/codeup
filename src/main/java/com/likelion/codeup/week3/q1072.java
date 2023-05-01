package com.likelion.codeup.week3;

import java.util.Scanner;

public class q1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");

        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }
}
