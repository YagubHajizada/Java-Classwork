package com.rcs.classwork.Day16Classes;

public class StringUtils {
    public static String getMiddle(String str) {
        if (str.length() % 2 == 0) {
            int middleOdd = str.length() / 2 + 1;
            int middleEven = middleOdd - 2;
            return str.substring(middleEven, middleOdd);
        } else {
            return str.substring(str.length() / 2, (str.length() / 2) + 1);
        }
    }

    public static String getReverse(String text) {
        String reverseText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            char letter = text.charAt(i);
            reverseText = reverseText.concat(Character.toString(letter));
        }

        return reverseText;
    }

    public static boolean isPalindrome(String text) {
        return text.equalsIgnoreCase(getReverse(text));
}
}