package com.magic.generics;
import  org.junit.*;
import org.junit.jupiter.api.Test;

class FindMaximumTest {
    @Test
    void maximum_Number_At_Position_1() {
        int result = FindMaximum.MaximumNumber(7, 5, 2).compareTo(7);
        Assert.assertEquals(0,result);
    }
}