package com.kitcenter.app.classwork.lesson6;


import java.util.Scanner;

/**
 * Created by Marina on 5/6/17.
 */
public class CircleArea {
//    public static final double PI = 3.14d;
//    public static double radius1 = 12;
//    public static double radius2 = 13;
//    public static int area1 = 12;
//    public static int area2 = 22;
   // public static void calculate() {
//        Scanner scanner = new Scanner(System.in);
    //    double radius = scanner.nextDouble();
        //double square = PI * radius*radius;

//        double square = PI * Math.pow(radius, 2);//считает радиус и оставляет точность после запятой в два знака
//        System.out.println("Area is " + square);

   // }

//
//    public static void calculateBigger() {

//        Scanner scanner1 = new Scanner(System.in);
//        int area1 =scanner1.nextInt();
//        int area2 =scanner1.nextInt();
//        if (area1 > area2) {
//            System.out.print("Area1 is bigger");
//        } else {
//            System.out.print("Area2 is bigger");
//
//        }
//
//
//    }
//    public static void radiusVSArea (){
//        if ( (radius1< radius2)||(area1>area2)){
//            System.out.println("Area1 is bigger");
//            System.out.println("Area2 is smaller");
//        }
//        else {
//            System.out.println("Area2 is bigger");
//            System.out.println("Area1 is smaller");
//        }
//
//    }

    public static void areaVSRadius() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter area 1 and 2");
       int area1 =scanner1.nextInt();
      int area2 =scanner1.nextInt();
        System.out.println("Enter radius 1 and 2");
        int radius1 = scanner1.nextInt();
      int radius2 = scanner1.nextInt();
        if ( (radius1< radius2)||(area1>area2)){
            System.out.println("Area1 is bigger");
            System.out.println("Area2 is smaller");
        }
        else {
            System.out.println("Area2 is bigger");
            System.out.println("Area1 is smaller");
        }
    }

}