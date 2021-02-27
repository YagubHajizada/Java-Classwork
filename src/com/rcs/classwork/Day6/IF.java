package com.rcs.classwork.Day6;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet x :");
        int x = scanner.nextInt();
        scanner.close();
        if (x % 2 == 0 && x <= 20 && x >= 6) {
            System.out.println("Divaini");
        } else if (x % 2 == 0 && x <= 5 && x >= 2 && x >20) {
            System.out.println("Nav divaini");
        }
    }
}
