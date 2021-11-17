package org.apache.commons.math3.complex;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    Complex complex1,complex2,complex3,complex4;
    @BeforeEach
    void setUp() {
        complex1=new Complex(3.0D,4.0D);
        complex2=new Complex(-1.0D,2.0D);
        complex3=new Complex(3.0D);
        complex4=new Complex(-1.0D,2.0D);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void abs() {
        Assert.assertEquals(5.0D,complex1.abs());//算出的正确结果应该使5.0，而计算出来的使3.0
    }

    @Test
    void add() {
        Complex complex=new Complex(2.0D,6.0D);
        Assert.assertEquals(complex,complex1.add(complex2));//正确使（2，6），算出的使（5，3）;

    }

    @Test
    void testAdd() {
    }

    @Test
    void testEquals() {
        Assert.assertEquals(true,complex2.equals(complex4));
    }

}