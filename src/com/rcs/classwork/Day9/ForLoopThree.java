package com.rcs.classwork.Day9;

import java.util.Scanner;

public class ForLoopThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ievada skaitli");
        int x = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= x; i++ ) {
            System.out.println(x + "*" + i + "=" + x * i);
        }
    }
}
