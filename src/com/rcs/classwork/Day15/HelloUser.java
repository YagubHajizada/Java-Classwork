package com.rcs.classwork.Day15;

import java.util.Scanner;

public class HelloUser {
    public static void sayHello(String name){
        System.out.printf("Hello, %s!\n", name);
    }
    public static void main(String[] args){
        System.out.println("Ludzu ievadiet savu vardu: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        sayHello(name);
    }
}
