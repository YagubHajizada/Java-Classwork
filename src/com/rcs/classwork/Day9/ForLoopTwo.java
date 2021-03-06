package com.rcs.classwork.Day9;

import java.util.Scanner;

public class ForLoopTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(Character.toUpperCase(text.charAt(i++)));
        }
    }
}
