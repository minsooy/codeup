package com.likelion.codeup.week3.day4;

import java.util.Scanner;

public class q1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] board = new int[10][10];
        int xCord = 1;
        int yCord = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        while(true){
            if(board[yCord][xCord] == 2){
                board[yCord][xCord] = 9;
                break;
            }

            board[yCord][xCord] = 9;

            if(board[yCord][xCord + 1] != 1){
                xCord++;
            }else if(board[yCord + 1][xCord] != 1){
                yCord++;
            } else{
                break;
            }

        }


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
