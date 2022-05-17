package com.espe.main;

import com.espe.controller.Arithmetic;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        actionCycle();
    }

    public static void actionCycle() {
        int times = 0;
        Random rand = new Random();
        while(times < 6) {
            float a =  rand.nextFloat() * 100;
            float b =  rand.nextFloat() * 100;
            System.out.println(String.format("a= %f and b= %f", a, b));
            operation(randomOperation(rand.nextInt() * 4), a, b);
            System.out.println("\n");
            times++;
        }
    }

    public static Operation randomOperation(int data) {
        switch (data) {
            case 1:
                return Operation.ADDITION;
            case 2:
                return Operation.SUBTRACT;
            case 3:
                return Operation.TIMES;
            default:
                return Operation.DIVIDE;
        }
    }

    public static void operation(Operation operation, float a, float b) {
        float data = 0;
        String type = "";
        switch (operation) {
            case ADDITION:
                type = "Addition";
                data = Arithmetic.addition(a, b);
                break;
            case SUBTRACT:
                type = "Subtract";
                data = Arithmetic.subtract(a, b);
                break;
            case TIMES:
                type = "Times";
                data = Arithmetic.multiply(a, b);
                break;
            case DIVIDE:
                type = "Divide";
                try {
                    data = Arithmetic.divide(a, b);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
        }

        System.out.println(String.format("%s \n Result: %f", type, data));
    }

    private enum Operation {
        ADDITION,
        SUBTRACT,
        TIMES,
        DIVIDE
    }
}
