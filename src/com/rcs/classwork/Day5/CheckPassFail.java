package com.rcs.classwork.Day5;

import java.util.Scanner;

public class CheckPassFail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        if (x >= 50) {
            System.out.println("PASS");
        } if (x < 50) {
            System.out.println("FAIL");
        } else if (!(x >= 50 && x < 50)) {
            System.out.println("DONE");
                 }
            }
            }


