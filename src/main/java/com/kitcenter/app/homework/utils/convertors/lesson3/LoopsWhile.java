package com.kitcenter.app.homework.utils.convertors.lesson3;

/**
 * Created by Marina on 5/13/17.
 */
public class LoopsWhile {

    public void whileMeth(int counterA, int counterB) {


        while (counterA > counterB) {
            counterA--;
            System.out.println("Counter A and Counter B not equals!");
        }
        if (counterA <= counterB) {
            System.out.println("Exit program!");
        }


    }
    public void forMethod (int i){
        for (i=0; i<10; i++){
            System.out.println("i = " + i);
        }
        int a = 1;
        System.out.println("Original a value " +a);
        System.out.println("Post-increment a " +a++);//изменяется на следуйщий вызов
        System.out.println("After post-increment a "  +a);
        System.out.println("Pre-increment a " + ++a);//изменяется сразу
        System.out.println("After pre-increment " + a);
    }


}




