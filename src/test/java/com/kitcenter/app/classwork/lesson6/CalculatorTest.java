package com.kitcenter.app.classwork.lesson6;

import com.kitcenter.app.classwork.lesson5.Calculator;
import org.junit.*;

/**
 * Created by Marina on 5/3/17.
 */
public class  CalculatorTest {
    int number1,number2;
     @BeforeClass
     public static void setBeforeclassSetUp(){

     }
     /*
     создание комментария
     initialize test for Callator functionality
      */
     @Before //перед каждым тестом
            public  void setUp (){
        //переменнные ,будет зависимость если изменить в методе
        number1 = 10;
         number2 = 40;//локальные переменные
         }



    @Test//тест всегда долже быть public void, параметры не принимает!!
    public void sumTest (){

        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(number1,number2);
        int expectedResult = 50;
        Assert.assertEquals(expectedResult, actualResult); //expected всегда на первом месте!
        System.out.println(actualResult);
    }
    @Test
    public void substructTest (){
        Calculator calculator = new Calculator();
        int actualResult = calculator.substract(23,22);
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, actualResult); //expected всегда на первом месте!
        System.out.println(actualResult);
    }
    @After //перед каждым тестом
    public void tearDown() {
        System.out.println("Postcondition for every test");
    }
    @AfterClass
    public static void tearDownForClass() {
        System.out.println("Postcondition for class test");
    }
}
