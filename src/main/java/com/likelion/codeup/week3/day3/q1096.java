package com.likelion.codeup.week3.day3;


import java.util.Scanner;

public class q1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[][] placement = new String[num][2];
        int[][] board = new int[19][19];

        for (int i = 0; i < num; i++) {
            placement[i] = sc.nextLine().split(" ");
        }

        for (int i = 0; i < num; i++) {
            board[Integer.parseInt(placement[i][0]) - 1][Integer.parseInt(placement[i][1]) - 1] = 1;
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.printf("\n");
        }


    }
}
