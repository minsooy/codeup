package com.likelion.codeup.week2.day5;

import java.util.Scanner;

public class q1441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        int[] arr = new int[elements];
        int temp = 0;

        for(int i = 0; i < elements; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < elements; i++)
        {
            for(int j = 0; j <elements - i; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < elements; i++){
            System.out.println(arr[i]);
        }
    }
}
