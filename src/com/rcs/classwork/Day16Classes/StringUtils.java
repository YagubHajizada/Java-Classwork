package com.rcs.classwork.Day16Classes;

public class StringUtils {
public static String getMiddle(String str) {
    if (str.length()%2 == 0) {
        int middleOdd = str.length() / 2 + 1;
        int middleEven = middleOdd - 2;
        return str.substring(middleEven, middleOdd);
    } else {
        return str.substring(str.length() / 2, (str.length() / 2) + 1);
    }
}
}
