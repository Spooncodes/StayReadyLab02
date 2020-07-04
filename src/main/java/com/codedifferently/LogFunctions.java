package com.codedifferently;

public class LogFunctions {
    public double naturalLog() {
        return Math.log(SciCalculator.currentValue);
    }

    public double inverseNaturalLog() {
        return Math.exp(Math.log(SciCalculator.currentValue));
    }

}