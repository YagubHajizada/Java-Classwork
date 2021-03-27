package com.rcs.classwork.Day16;

import com.rcs.classwork.Day16Classes.StringUtils;

import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
        System.out.print("Ludzu, ievadiet tekstu: ");
        Scanner read = new Scanner(System.in);
        String text = read.nextLine();
        read.close();
        System.out.println("Teksta vidu ir: " + StringUtils.getMiddle(text));
        System.out.println("Teksta reversā veida ir: " + StringUtils.getReverse(text));
        System.out.println("Palindrome: " + StringUtils.isPalindrome(text));
    }
}
