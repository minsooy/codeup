package com.likelion.codeup.week3.day3;

import java.util.Scanner;

public class q1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] board =  new String[19][19];
        for (int i = 0; i < 19; i++) {
            board[i] = sc.nextLine().split(" ");
        }

        int num = Integer.parseInt(sc.nextLine());

        String[][] placement = new String[num][2];
        for (int i = 0; i < num; i++) {
            placement[i] = sc.nextLine().split(" ");
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 19; j++) {
                if(board[j][Integer.parseInt(placement[i][1])-1].equals("1")){
                    board[j][Integer.parseInt(placement[i][1])-1] = "0";
                }else{
                    board[j][Integer.parseInt(placement[i][1])-1] = "1";
                }
                if(board[Integer.parseInt(placement[i][0])-1][j].equals("1")){
                    board[Integer.parseInt(placement[i][0])-1][j] = "0";
                }else{
                    board[Integer.parseInt(placement[i][0])-1][j] = "1";
                }
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%s ", board[i][j]);
            }
            System.out.printf("\n");
        }


    }
}
