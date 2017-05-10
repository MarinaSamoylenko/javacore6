package com.kitcenter.app.classwork.lesson4.lesson6;

import java.util.Scanner;

/**
 * Created by Marina on 5/10/17.
 */
public class EvenOdd {
    public void balance() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt() % 2;
        if (result == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
    }
}
