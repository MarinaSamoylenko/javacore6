package com.kitcenter.runners.classwork.lesson6;

import com.kitcenter.app.homework.utils.convertors.lesson3.LoopsWhile;

import java.util.Scanner;

/**
 * Created by Marina on 5/13/17.
 */
public class LoopsWhileRunner {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter counter 1 and 2");
        int counterA = scanner1.nextInt();
        int counterB = scanner1.nextInt();
        LoopsWhile loopsWhile = new LoopsWhile();
        loopsWhile.whileMeth(counterA, counterB);
        loopsWhile.forMethod(10);

    }


}
