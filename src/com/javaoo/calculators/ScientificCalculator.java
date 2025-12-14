package com.javaoo.calculators;

public class ScientificCalculator {

    public static final double PI = Math.PI;
    private double holdValue;

    public double exp(double arg) {
        return Math.exp(arg);
    }

    public double log(double arg) {
        return Math.log(arg);
    }

    public void putValueInMemory(double value) {
        holdValue = value;
    }

    public double getValueFromMemory() {
        return holdValue;
    }

}
