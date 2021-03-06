package com.rcs.classwork.Day9;

import java.util.Scanner;

public class DoWhileLoopTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        int i = 0;
        do {
            System.out.println(text.toUpperCase().charAt(i++));
        } while (i < text.length());
    }
}
