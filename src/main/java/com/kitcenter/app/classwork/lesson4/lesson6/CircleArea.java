package com.kitcenter.app.classwork.lesson4.lesson6;


import java.util.Scanner;

/**
 * Created by Marina on 5/6/17.
 */
public class CircleArea {
    public static final double PI = 3.14d;

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        //double square = PI * radius*radius;
        double square = PI * Math.pow(radius, 2);//считает радиус и оставляет точность после запятой в два знака
        System.out.println("Area is " + square);

    }


    public static void calculateBigger() {
//        int area1 = 12;
//        int area2 = 22;
        Scanner scanner1 = new Scanner(System.in);
        int area1 =scanner1.nextInt();
        int area2 =scanner1.nextInt();
        if (area1 > area2) {
            System.out.print("Area1 is bigger");
        } else {
            System.out.print("Area2 is bigger");

        }


    }
}