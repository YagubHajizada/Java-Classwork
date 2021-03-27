package com.rcs.classwork.Day16;

public class MethodOverloading {
    public static int sum(int x, int y) {
        return (x + y);
    }
    public static int sum(int x, int y, int z) {
        return (x + y + z);
    }
    public static float sum(float x, float y) {
        return (x + y);
    }
    public static float sum(float x, float y, float z) {
        return (x + y + z);
    }
    public static void main(String args[]) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10.5f,576.7f ));
        System.out.println(sum(10.8f, 18.9f, 16.65f));
    }
}
