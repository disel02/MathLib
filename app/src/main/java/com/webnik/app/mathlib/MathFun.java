package com.webnik.app.mathlib;

public class MathFun {

    public static int plus(int a,int b)
    {
        return a+b;
    }

    public static int substract(int a,int b)
    {
        return a-b;
    }

    public static int multiply(int a,int b)
    {
        return a*b;
    }

    public static float division(int a,int b)
    {
        if (b==0)
            throw new IllegalArgumentException("Divided by zero");
        else
            return a/b;
    }

}
