package com.rcs.classwork.Day6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ievadiet a :");
        float a = scanner.nextFloat();
        System.out.print("ievadiet b:");
        float b = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Ievadiet darbibu (+,-,*,/): ");
        String action = scanner.nextLine();
        scanner.close();
        switch (action) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            default:
                System.out.println("END");
        }
    }
}