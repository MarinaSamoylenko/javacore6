package com.kitcenter.app.classwork.lesson5;

import com.kitcenter.app.classwork.lesson4.lesson5.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Marina on 5/3/17.
 */
public class CalculatorTest {
    int numberOne = 2;
    int numberTwo = 4;//переменнные ,будет зависимость если изменить в методе
    @Test//тест всегда долже быть public void, параметры не принимает!!
    public void sumTest (){
        int number1 = 10;
        int number2 = 40;//локальные переменные
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(number1,number2);
        int expectedResult = 50;
        Assert.assertEquals(expectedResult, actualResult); //expected всегда на первом месте!
        System.out.println(actualResult);
    }
    public void substructTest (){
        Calculator calculator = new Calculator();
        int actualResult = calculator.substract(23,22);
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, actualResult); //expected всегда на первом месте!
        System.out.println(actualResult);
    }
}
