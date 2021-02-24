package com.rcs.classwork.Day5;

import java.util.Scanner;

public class CheckPassFail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet x :");
        int x = scanner.nextInt();
        scanner.close();
        if (x >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}


