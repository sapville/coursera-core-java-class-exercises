package com.javaoo.calculators;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void basicCalculatorTest() {
        BasicCalculator calculator = new BasicCalculator();
        assertEquals(4, calculator.add(2, 2));
        assertEquals(4, calculator.multiply(2, 2));
        assertEquals(2, calculator.subtract(4, 2));
        assertEquals(2, calculator.divide(4, 2));
        assertThrows(InvalidParameterException.class, () -> calculator.divide(4, 0));
    }

    @Test
    public void scientificCalculatorTest() {
        ScientificCalculator calculator = new ScientificCalculator();
        assertEquals(round(Math.pow(Math.E, 2)), round(calculator.exp(2)));
        assertEquals("1.38629", round(calculator.log(4)));
    }

    @Test
    public void trigonometricCalculatorTest() {
        TrigonometricCalculator calculator = new TrigonometricCalculator();
        assertEquals(1, calculator.sine(degreeToRadian(90)));
        assertEquals(-1, calculator.cosine(degreeToRadian(180)));
        assertEquals(0, calculator.tangent(degreeToRadian(0)));
        assertEquals(degreeToRadian(90), calculator.arcsine(1));
        assertEquals(degreeToRadian(180), calculator.arccosine(-1));
        assertEquals(degreeToRadian(0), calculator.arctangent(0));
    }

    private String round(double arg) {
        return String.format("%.5f", arg);
    }

    private double degreeToRadian(double degree) {
        return degree * (ScientificCalculator.PI / 180);
    }
}
