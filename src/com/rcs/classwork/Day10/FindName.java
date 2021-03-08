package com.rcs.classwork.Day10;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        String[] names = {"Kristaps", "Kristīne", "Līga",
                "Matīss", "Martiņš", "Jānis",
                "Ilze", "Sanita", "Sandijs"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Meklet: ");
        String searchBy = scanner.next();
        scanner.close();
        for (String name : names) {
            if (name.toUpperCase().startsWith(searchBy.trim().toUpperCase())) {
                System.out.println(name);
            }
        }
    }
}