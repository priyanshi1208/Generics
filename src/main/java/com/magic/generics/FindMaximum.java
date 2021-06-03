package com.magic.generics;

public class FindMaximum {
public static Integer MaximumNumber(int x, int y, int z){
    return (z>y)?(z>x?z:x):(y>x?y:x);
}
    public static Float MaximumNumber(float x, float y, float z){
        return (z>y)?(z>x?z:x):(y>x?y:x);
    }
    public static String MaximumNumber(String x, String y, String z){
        return (y.compareTo(x)>0)?(y.compareTo(z)>0?y:z):(z.compareTo(x)>0?z:x);
    }
    public static <E extends Comparable<E>> E Maximum(E x,E y,E z){
        return (y.compareTo(x)>0)?(y.compareTo(z)>0?y:z):(z.compareTo(x)>0?z:x);
    }
}
