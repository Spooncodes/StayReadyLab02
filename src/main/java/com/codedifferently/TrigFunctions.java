package com.codedifferently;

public class TrigFunctions {
    public double sine() {
        return Math.sin(SciCalculator.currentValue);
    }

    public double cosine() {
        return Math.cos(SciCalculator.currentValue);
    }

    public double tangent() {
        return Math.tan(SciCalculator.currentValue);
    }

    public double inverseSine() {
        return Math.asin(SciCalculator.currentValue);
    }

    public double inverseCosine() {
        return Math.acos(SciCalculator.currentValue);
    }

    public double inverseTangent() {
        return Math.atan(SciCalculator.currentValue);
    }

}