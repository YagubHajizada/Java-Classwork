package com.rcs.classwork.Day5;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet x :");
        int x = scanner.nextInt();
        scanner.close();
        if (x % 2 == 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }

    }
}
