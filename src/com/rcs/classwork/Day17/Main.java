package com.rcs.classwork.Day17;

public class Main {
    public static void main(String[] args) {
        Circle redCircle = new Circle(6.4, "Red");
        Circle blueCircle = new Circle(2.0, "Blue");
        Circle blackCircle = new Circle(3.2);

        System.out.printf("color = %s, area = %f, Circle Length = %f\n",redCircle.color, redCircle.getArea(),redCircle.getCircleLength());
        System.out.printf("color = %s, area = %f, Circle Length = %f\n",blueCircle.color, blueCircle.getArea(),blueCircle.getCircleLength());
        System.out.printf("color = %s, area = %f, Circle Length = %f\n",blackCircle.color, blackCircle.getArea(),blackCircle.getCircleLength());
    }
}
