package com.rcs.classwork.Day9;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int number = new Random().nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzmini ciparu par kuru es domāju...");
        int guess = scanner.nextInt();
        while (guess != number) {
            System.out.print("Nepareizi! Megini velreizi:");
            guess = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Pareizi! Ciparis ir" + number);
    }
}


