package com.kitcenter.app.classwork;

/**
 * Created by Marina on 5/3/17.
 */
public class WideningCasting {
    byte byte1 = 127;
    short short1 = 0;
    int int1 = 0;
    long long1 = 0L;
    float float1 = 0.1f;
    double double1 = 0.3d;

    public void widening (){
       double1 = float1 = long1 = int1 = short1 = byte1;
       System.out.println("Double = " + double1);

    }
}
