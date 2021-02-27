package com.rcs.classwork.Day6;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int punkts = 0;
        System.out.print("ievadi skaitli: ");
        if (scanner.hasNextDouble()) {
            System.out.println(scanner.hasNextDouble());
            punkts++;
        }
        scanner.nextLine();
        System.out.print("Ievadi boolean tipa vertibu: ");
        if (scanner.hasNextBoolean()) {
            System.out.println(scanner.hasNextBoolean());
            punkts++;
        }
        scanner.nextLine();
        System.out.print("Ievadi tekstu: ");
        if (scanner.hasNextLine()); {
        System.out.println(scanner.nextLine());
            punkts++;
        }
        scanner.close();
        System.out.println("Punktu skaits: " + punkts);
    }

}

