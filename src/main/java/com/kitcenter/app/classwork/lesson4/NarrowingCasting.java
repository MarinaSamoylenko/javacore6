package com.kitcenter.app.classwork.lesson4;

/**
 * Created by Marina on 5/3/17.
 */
public class NarrowingCasting {
    int int1 = 127;
    float float1 = 0.0f;
    int int2 = 0;
    float float2 = 3.14159f;
    double double1 = 2.2d;

    public void narrowing() {
        float1 = int1;
        System.out.println(float1);
    }

    public void narrowingCasting() {
        int2 = (int) float2; // casting on int, указываем тип переменной, в которую хотим конвертировать
        System.out.println(int2);
    }

    public void castingDoubleInFloat() {
        double1 = (double) float2;
        System.out.println(float2);
    }

}
