package com.javaoo.calculators;

import java.security.InvalidParameterException;

public class BasicCalculator {

    public double add(double left, double right) {
        return left + right;
    }

    public double subtract(double left, double right) {
        return left - right;
    }

    public double multiply(double left, double right) {
        return left * right;
    }

    public double divide(double left, double right) throws InvalidParameterException {
        if (right == 0) {
            throw new InvalidParameterException();
        }
        return left / right;
    }

    public static void main(String[] args) {
        System.out.println(new BasicCalculator().divide(5, 2));
    }

}
