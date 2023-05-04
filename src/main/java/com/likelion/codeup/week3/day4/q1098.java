package com.likelion.codeup.week3.day4;

import java.util.Scanner;

public class q1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board =  new int[sc.nextInt()][sc.nextInt()];
        int stick = sc.nextInt();


        for (int i = 0; i < stick; i++) {
            int length = sc.nextInt();
            int direction = sc.nextInt();
            int xCord = sc.nextInt() - 1;
            int yCord =sc.nextInt() - 1;

            for (int j = 0; j < length; j++) {
                if(direction == 0){
                    board[xCord][yCord + j] = 1;
                }
                else{
                    board[xCord + j][yCord] = 1;
                }
            }

        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }

    }
}
