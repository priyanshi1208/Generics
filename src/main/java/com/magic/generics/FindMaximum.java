package com.magic.generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FindMaximum<E extends Comparable<E>> {
   private E x,y,z;

    public FindMaximum(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static <E extends Comparable<E>> E max(E...x){
        return Arrays.stream(x).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(0);
    }
    public static <E>void printMax(E max){
        System.out.println(max);
    }

    public static <E extends Comparable<E>> E testMaximum(E x, E y, E z){
         return (y.compareTo(x)>0)?(y.compareTo(z)>0?y:z):(z.compareTo(x)>0?z:x);
    }
    public static Integer MaximumNumber(int x, int y, int z){
        return (z>y)?(z>x?z:x):(y>x?y:x);
    }
    public static Float MaximumNumber(float x, float y, float z) {
        return (z > y) ? (z > x ? z : x) : (y > x ? y : x);
    }
    public static String MaximumNumber(String x, String y, String z){
        return (y.compareTo(x)>0)?(y.compareTo(z)>0?y:z):(z.compareTo(x)>0?z:x);
    }
    public static <E extends Comparable<E>> E Maximum(E x,E y,E z){
        return (y.compareTo(x)>0)?(y.compareTo(z)>0?y:z):(z.compareTo(x)>0?z:x);
    }
}
