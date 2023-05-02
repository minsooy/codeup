package com.likelion.codeup.week3.day2;

import java.io.*;
import java.util.Scanner;

public class q1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                String line = "";
                for (int k = 0; k < n3; k++) {
                    line += i + " " + j + " " + k + "\n";
                }
                bw.write(line);
                bw.flush();
            }
        }
        System.out.println(n1 * n2 * n3);

    }

}

/**
 * 이번 문제는 다시 돌아와서 한번 더 공부 할것 (버퍼드리더)
 */