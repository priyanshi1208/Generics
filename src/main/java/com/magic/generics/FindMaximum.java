package com.magic.generics;

public class FindMaximum {
public static Integer MaximumNumber(int x, int y, int z){
    return (z>y)?(z>x?z:x):(y>x?y:x);
}
    public static Float MaximumNumber(float x, float y, float z){
        return (z>y)?(z>x?z:x):(y>x?y:x);
    }
}
