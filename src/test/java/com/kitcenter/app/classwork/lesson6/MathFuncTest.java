package com.kitcenter.app.classwork.lesson6;

import com.kitcenter.app.homework.utils.convertors.lesson6.MathFunc;
import org.junit.*;
import org.junit.Assert.*;

import org.junit.*;
import org.junit.runners.MethodSorters;


/**
 * Created by Marina on 5/10/17.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //сортировка тестов по алфавиту
public class MathFuncTest {


    @Test
    public void add1() {
        System.out.println("add");
        int a = 0;
        int b = 3;
        int actualResult = Math.max(a, b);
        int expectedResult = b;
        Assert.assertEquals(expectedResult, actualResult);

    }
//    @Test
//    public void minArgTest () {
//    int w = 10;
//    int b = 8;
//        MathFunc mathFunc3 = new MathFunc();
//        int actualResult =  mathFunc3.minArg(w,b);
//        int expectedResult = 2;
//        Assert.assertEquals(expectedResult,actualResult);
//    }

    @Test
    public void addTest() {
        int c = 12;
        int b = 4;
        MathFunc add = new MathFunc();
        int actualResult = add.add(c, b);
        int expectedResult = 16;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divPlusTest() {
        int a = 12;
        int b = 4;
        int c = 2;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.divPlus(a, b, c);
        int expectedResult = 22;
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void minArg1Test() {
        System.out.println("min");
        int w = 0;
        int b = 32;
        int actualResult = Math.min(w, b);
        int expectedResult = w;
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test //Junit framework annotation
    public void multiplyTest() {
        int w = 1;
        int s = 2;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.multiply(w, s);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sumTest() {
        int x = 2;
        int y = 3;
        MathFunc mathsum = new MathFunc();
        int actualResult = mathsum.sum(x, y);
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void minusTest() {
        int q = 109;
        int e = 30;
        MathFunc difference = new MathFunc();
        int actualResult = difference.minus(q, e);
        int expectedResult = 79;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void summaTest() {
        int d = 124;
        int c = 231;
        MathFunc getSum = new MathFunc();
        int actualResult = getSum.summa(d, c);
        int expectedResult = 355;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void subtracionTest() {
        int s = 12389;
        int z = 5669;
        MathFunc getSubtracion = new MathFunc();
        int actualResult = getSubtracion.subtracion(s, z);
        int expectedResult = 6720;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divTest() {
        int a = 6;
        int b = 2;
        MathFunc getDiv = new MathFunc();
        int actualResult = getDiv.div(a, b);
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calPlusTest() {
        int a = 81;
        int b = 11;
        MathFunc getCalPlus = new MathFunc();
        int actualResult = getCalPlus.calPlus(a, b);
        int expectedResult = 92;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void minTest() {
        int y = 3122;
        int x = 22;
        MathFunc getMin = new MathFunc();
        int actualResult = getMin.min(y, x);
        int expectedResult = 3166;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divAndMinusTest() {
        int a = 48;
        int b = 1;
        int c = 6;
        int d = 9;
        MathFunc getDivAndMinus = new MathFunc();
        int actualResult = getDivAndMinus.divAndMinus(a, b, c, d);
        int expectedResult = 33;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void minAndPlusTest() {
        int a = 243;
        int b = 51;
        MathFunc getMinAndPlus = new MathFunc();
        int actualResult = getMinAndPlus.minAndPlus(a, b);//передача параметров
        int expectedResult = 588;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void plusTest() {
        String name = "Marina ";
        String surname = "Samoylenko";
        MathFunc sPlus = new MathFunc();
        String actualResult = sPlus.plus(name, surname);
        String expectedResult = "Marina Samoylenko";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void myfuncz() {
        short a = 2456;
        short b = 5431;
        short c = 1;
        MathFunc getFunc = new MathFunc();
        short actualResult = getFunc.myfunc(a, b, c);
        short expectedResult = 7887;
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test(timeout = 1000)//infinit loop еслі тест не виполнітся через 1000 сек, тест остановітся і видастся ошібка
    public void infinityTest() {
        while (true) ;
    }

    @Ignore("Not Ready yet")
    @Test(timeout = 1000)
    public void thisTestNotReady(){}
}


