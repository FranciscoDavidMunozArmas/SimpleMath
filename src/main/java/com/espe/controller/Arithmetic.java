package com.espe.controller;

public class Arithmetic {

    public static float addition(float a, float b) {
        return a+b;
    }

    public static float subtract(float a, float b) {
        return a-b;
    }

    public static float multiply(float a, float b) {
        return a*b;
    }

    public static float divide(float a, float b) throws Exception{
        if (b == 0){
            throw new Exception("Cannot divide by 0");
        } else {
            return a/b;
        }
    }
}
