package com.ivan.simpleandroidcalculator;

public class Calculator {
    private double result;

    public double add(double num1, double num2) {
        result = num1 + num2;
        return result;
    }

    public double subtract(double num1, double num2) {
        result = num1 - num2;
        return result;
    }

    public double multiply(double num1, double num2) {
        result = num1 * num2;
        return result;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return result;
    }

    public double percent(double num) {
        result = num / 100;
        return result;
    }

    public double changeSign(double num) {
        return -num;
    }
}