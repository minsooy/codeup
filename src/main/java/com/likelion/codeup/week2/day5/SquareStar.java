package com.likelion.codeup.week2.day5;

import java.util.Scanner;

public class SquareStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        String[][] square = new String[height][width];

        for (int i =0; i < height; i++){
            for (int j = 0; j< width; j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }


    }
}
