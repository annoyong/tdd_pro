package com.cn;


import org.junit.Assert;
import org.junit.Test;

public class TddTest {

    @Test
    public void f() {
        int a =new Tdd().f();
        Assert.assertEquals(9,a);
    }
}