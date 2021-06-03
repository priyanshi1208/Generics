package com.magic.generics;
import  org.junit.*;
import org.junit.jupiter.api.Test;

class FindMaximumTest {
    @Test
    void maximum_Number_At_Position_1() {
        int result = FindMaximum.MaximumNumber(7, 5, 2).compareTo(7);
        Assert.assertEquals(0,result);
    }
    @Test
    void maximum_Number_At_Position_2() {
        int result = FindMaximum.MaximumNumber(7, 9, 2).compareTo(9);
        Assert.assertEquals(0,result);
    }
    @Test
    void maximum_Number_At_Position_3() {
        int result = FindMaximum.MaximumNumber(7, 9, 17).compareTo(17);
        Assert.assertEquals(0,result);
    }
    @Test
    void maximum_Number_At_Position_3_Is_False() {
        int result = FindMaximum.MaximumNumber(7, 9, 17).compareTo(9);
        Assert.assertEquals(1,result);
    }
    @Test
    void maximum_NumberFloat_At_Position_1() {
        int result = FindMaximum.MaximumNumber(7.4f, 5.3f, 2.8f).compareTo(7.4f);
        Assert.assertEquals(0,result);
    }
    @Test
    void maximum_NumberFloat_At_Position_2() {
        int result = FindMaximum.MaximumNumber(7.5f, 9.7f, 2.8f).compareTo(9.7f);
        Assert.assertEquals(0,result);
    }
    @Test
    void maximum_NumberFloat_At_Position_3() {
        int result = FindMaximum.MaximumNumber(7.9f, 9.5f, 17.9f).compareTo(17.9f);
        Assert.assertEquals(0,result);
    }
    @Test
    void maximum_NumberFloat_At_Position_3_Is_False() {
        int result = FindMaximum.MaximumNumber(7.2f, 9.3f, 17.5f).compareTo(9.3f);
        Assert.assertEquals(1,result);
    }
}