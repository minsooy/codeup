package com.likelion.codeup.week4.day2;

import java.util.Scanner;

public class Oop1098 {
    static int[][] board;
    static int stick;

    public static void placeStick(int length, int direction, int xCord, int yCord){

        for (int j = 0; j < length; j++) {
            if(direction == 0){
                board[xCord][yCord + j] = 1;
            }
            else{
                board[xCord + j][yCord] = 1;
            }
        }
    }

    public static void boardDisplay() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board =  new int[sc.nextInt()][sc.nextInt()];
        stick = sc.nextInt();
        for (int i = 0; i < stick; i++) {
            placeStick(sc.nextInt(), sc.nextInt(), sc.nextInt() - 1, sc.nextInt() - 1);
        }
        boardDisplay();
    }
}
