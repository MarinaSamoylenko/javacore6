package com.kitcenter.app.homework.utils.convertors;

/**
 * Created by Marina on 5/6/17.
 */
public class PrimitiveConvertor {
    float floatCast = 0.1f;
    int intCast = 134;
    int i = 0;
    char charCast = 233;
//    public char floatToChar (float floatCast)
//    {
//
//    }
    public void floatToChar(){
        floatCast = (float) charCast;
        System.out.println(charCast);
    }

    public void intToChar(){
        intCast = (int) charCast;
        System.out.println(charCast);
    }
    public void CharToInt(){
        charCast = (char) i;
        System.out.println();
    }
}
