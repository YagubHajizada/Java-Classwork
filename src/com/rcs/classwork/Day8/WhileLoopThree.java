package com.rcs.classwork.Day8;

import java.util.Scanner;

public class WhileLoopThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ievada skaitli");
        int x = scanner.nextInt();
        scanner.close();

        int i = 1;
        while (i <= x ) {
            System.out.println(x + "*" + i + "=" + x * i);
            i++;
        }
    }
}