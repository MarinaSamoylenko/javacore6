package com.kitcenter.runners.homework.utils.convertors;

import com.kitcenter.runners.classwork.lesson6.LoopsWhileRunner;

import java.util.Scanner;

/**
 * Created by Marina on 5/16/17.
 */
public class Lesson7Runner {
    public static void main(String[] args) {
        System.out.println("Enter first letter for find class: ");
        Scanner scanner = new Scanner(System.in);
        String nameForClass, answer = null;
        int numberForClass = scanner.nextInt();
        switch (numberForClass) {
            case 1:
                nameForClass = "LoopsWhile";
                System.out.println("You enter - \"LoopsWhile\" class.");
                break;
            case 2:
                nameForClass = "MathFunc";
                System.out.println("You enter - \"MathFunc\" class.");
                break;
            case 3:
                nameForClass = "PrimitiveConvertor";
                System.out.println("You enter - \"PrimitiveConvertor\" class.");
                break;
            default:
                System.out.println("Incorrect input.");
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Continue? Enter \"y\" for yes, \"n\" for not");
       String letter;
        do {
          letter = scanner1.nextLine();
            switch (letter) {
                case "n":
                    answer = "Not";
                    System.out.println("Goodbye!");
                    break;
                case "y":
                    answer = "Yes";
                    System.out.println();
                    System.out.println("Enter first letter for find class: ");
                    scanner.nextInt();
                    break;
                default:
                    System.out.println("Incorrect input.");
            }
        } while (letter.compareTo("y") != 0);
        System.out.println("Continue? Enter \"y\" for yes, \"n\" for not");
            scanner1.nextLine();
        System.out.println("Enter first letter for find class: ");
            scanner.nextInt();
        }
    }

