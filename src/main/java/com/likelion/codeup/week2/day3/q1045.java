package com.likelion.codeup.week2.day3;

import java.util.Scanner;

public class q1045 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        long numSum = (long) val1 + val2;
        int numDiff = val1 - val2;
        long numProd = (long) val1 * val2;
        int numQuo = val1 / val2;
        int numRemain = val1 % val2;
        float division = (float) val1 / val2;
        System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f" , numSum,numDiff,numProd,numQuo,numRemain,division);

    }
}
