package com.rcs.classwork.Day9;

import java.util.Scanner;

public class DoWhileLoopThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ievada skaitli");
        int x = scanner.nextInt();
        scanner.close();

        int i = 1;
        do {
            System.out.println(x + "*" + i + "=" + x * i);
            i++;
        } while (i <= x );
        }
    }

