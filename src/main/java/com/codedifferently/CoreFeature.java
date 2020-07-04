package com.codedifferently;

public class CoreFeature {

    public double add(double num) {
        return SciCalculator.currentValue + num;
    }

    public double subtract(double num) {
        return SciCalculator.currentValue - num;
    }

    public double divide(double num) {
        if (num == 0) {
            System.out.println("You can't divide by zero.");
            return 0.0;
        } else {
            return SciCalculator.currentValue / num;
        }
    }

    public double multiply(double num) {
        return SciCalculator.currentValue * num;
    }

    public double exponent(double num) {
        return Math.pow(SciCalculator.currentValue, num);
    }

    public double square() {
        return SciCalculator.currentValue * SciCalculator.currentValue;
    }

    public double root() {
        return Math.sqrt(SciCalculator.currentValue);
    }

    public double inverse() {
        return 1.0 / SciCalculator.currentValue;
    }

    public double switchSign() {
        return SciCalculator.currentValue * -1.0;
    }
}