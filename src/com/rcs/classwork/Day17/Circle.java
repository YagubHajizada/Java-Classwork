package com.rcs.classwork.Day17;

public class Circle {
    String color;
    double radius;
    static final double pi = 3.14159265;

    public Circle(double rad) {
        this.color = "Black";
        this.radius = rad;
    }
    public Circle(double rad, String clr) {
        this.color = clr;
        this.radius = rad;
    }
    public double getArea() {
        return pi * Math.pow(this.radius, 2);
    }
    public double getCircleLength() {
        return pi * this.radius * 2;
    }
}
