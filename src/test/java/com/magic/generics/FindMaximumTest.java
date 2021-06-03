package com.magic.generics;
import  org.junit.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;

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
    @Test
    void maximum_NumberString_At_Position_1() {
        int result = FindMaximum.MaximumNumber("apple", "banana", "peaches").compareTo("peaches");
        Assert.assertEquals(0,result);
    }
    @Test
    void maximum_NumberString_At_Position_2() {
        int result = FindMaximum.MaximumNumber("apple", "peaches", "banana").compareTo("peaches");
        Assert.assertEquals(0,result);
    }
    @Test
    void maximum_NumberString_At_Position_3() {
        int result = FindMaximum.MaximumNumber("apple", "banana", "peaches").compareTo("peaches");
        Assert.assertEquals(0,result);
    }
    @Test
    void maximum_NumberString_At_Position_3_Is_False() {
        boolean result = FindMaximum.MaximumNumber("apple", "banana", "peaches").equals("apple");
        Assert.assertFalse(result);
    }
    @Test
    void maximum_in_Generics_in_Integers_at_1(){
        boolean result=FindMaximum.Maximum(9,5,7).equals(9);
        Assert.assertTrue(result);
    }
    @Test
    void maximum_in_Generics_in_Integers_at_2(){
        boolean result=FindMaximum.Maximum(9,15,7).equals(15);
        Assert.assertTrue(result);
    }
    @Test
    void maximum_in_Generics_in_Integers_at_3(){
        boolean result=FindMaximum.Maximum(9,5,71).equals(71);
        Assert.assertTrue(result);
    }
    @Test
    void maximum_in_Generics_in_Float_at_1(){
        boolean result=FindMaximum.Maximum(91f,5f,71f).equals(91f);
        Assert.assertTrue(result);
    }
    @Test
    void maximum_in_Generics_in_Float_at_2(){
        boolean result=FindMaximum.Maximum(91f,215f,71f).equals(215f);
        Assert.assertTrue(result);
    }
    @Test
    void maximum_in_Generics_in_Float_at_3(){
        boolean result=FindMaximum.Maximum(91f,5f,710f).equals(710f);
        Assert.assertTrue(result);
    }
    @Test
    void maximum_in_Generics_in_String_at_1(){
        boolean result=FindMaximum.Maximum("peaches","apple","banana").equals("peaches");
        Assert.assertTrue(result);
    }
    @Test
    void maximum_in_Generics_in_String_at_2(){
        boolean result=FindMaximum.Maximum("apple","peaches","banana").equals("peaches");
        Assert.assertTrue(result);
    }
    @Test
    void maximum_in_Generics_in_String_at_3(){
        boolean result=FindMaximum.Maximum("banana","apple","peaches").equals("peaches");
        Assert.assertTrue(result);
    }
   


}