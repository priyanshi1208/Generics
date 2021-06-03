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
}