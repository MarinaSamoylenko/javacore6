package com.kitcenter.app.homework;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Marina on 5/17/17.
 */
@RunWith(JUnitParamsRunner.class)//передача параметров в метод для целого класса
public class Lesson7_DDT {
    @Test
    @FileParameters(value = "src/test/resources/testdataMultiplyExact.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataDrivenTests (int arg1, int arg2, int result){
        Assert.assertEquals(result, Math.multiplyExact(arg1, arg2));

    }
    @Test
    @FileParameters(value = "src/test/resources/testdata2Subtract.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataDDT(int arg1, int arg2, int result){
        Assert.assertEquals(result, Math.subtractExact(arg1, arg2));

    }
    @Test
    @FileParameters(value = "src/test/resources/testdataMax.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataDDT2 (int arg1, int arg2, int result){
        Assert.assertEquals(result, Math.max(arg1, arg2));

    }
}
