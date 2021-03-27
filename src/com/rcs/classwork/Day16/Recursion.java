package com.rcs.classwork.Day16;

import java.util.Scanner;

public class Recursion {
    public static int factorial(int n) {
     /*   int result = 1;
        for(int i = n; i > 0; i--) {
            result *=i;
        }
       return result;
        if (n > 1) {
            return factorial(n - 1) * n;
        } else {
            return n;
        } */
        return n > 1 ? n* factorial(n - 1 ) : 1;
    }
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n;
    do {
        System.out.print("Ievadi pozitivu skaitli: ");
        n = scanner.nextInt();
    } while (n < 0);
    scanner.close();

    System.out.printf("%d! = %d\n", n, factorial(n));
        System.out.printf("fibonacci %d = %d\n", n, fibonacci(n));    }
}
