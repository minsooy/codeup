package com.likelion.codeup.week3.day4;

import java.util.Scanner;

public class q4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int [9][9];
        int max = 0;
        int xMax = 0;
        int yMax = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] > max){
                    max = board[i][j];
                    xMax = i + 1;
                    yMax = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", xMax, yMax);


    }
}
