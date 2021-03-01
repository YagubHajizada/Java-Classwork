package com.rcs.classwork.Day7;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        scanner.close();

        String longText = text1.length() >= text2.length() ? text1 : text2;
        String shortText = text1.length() >= text2.length() ? text2 : text1;
        System.out.println(shortText + longText.toUpperCase() + shortText);
    }
}
