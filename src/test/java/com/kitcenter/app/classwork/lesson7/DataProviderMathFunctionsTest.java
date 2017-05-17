package com.kitcenter.app.classwork.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Marina on 5/13/17.
 */
@RunWith(JUnitParamsRunner.class)

public class DataProviderMathFunctionsTest {

    @Test

    @FileParameters(value = "src/test/resources/testdata.csv",

            mapper = CsvWithHeaderMapper.class)//класс, который берет знчение из колонок

    public void dataProviderTestAdd(int argA, int argB, int expOut) {

        Assert.assertEquals(expOut, Math.multiplyExact(argA, argB));

    } //Убедитесь, что переменные находятся в том же порядке, что и в файле csv

}