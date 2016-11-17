package com.oleg.app;

import org.junit.Assert;
import org.junit.Test;

/**
 * тест2
 */
public class MathFuncTest {

    @Test
    public void multiplyTest(){
        int a = 40, b = 20, expRes = 800;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }
}
