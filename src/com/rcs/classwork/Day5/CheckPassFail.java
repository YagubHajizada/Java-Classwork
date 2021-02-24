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
        } if (x < 50) {
            System.out.println("FAIL");
        } else {
            System.out.println("DONE");
                 }
            }
            }


