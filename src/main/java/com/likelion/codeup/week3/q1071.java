package com.likelion.codeup.week3;

import java.util.Scanner;

public class q1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("0")){
                break;
            }
            System.out.println(arr[i]);
        }
    }
}
