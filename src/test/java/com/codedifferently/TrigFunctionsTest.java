package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrigFunctionsTest {

    TrigFunctions trigFunction;

    @Before
    public void setup() {
        this.trigFunction = new TrigFunctions();
    }

    @Test
    public void sineTest() {
        // Given
        double expected = 0.9092974268256817;
        SciCalculator.setCurrentValue(2.0);
        // When
        double actual = trigFunction.sine();
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void cosineTest() {
        // Given
        double expected = -0.4161468365471424;
        SciCalculator.setCurrentValue(2.0);
        // When
        double actual = trigFunction.cosine();
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void tangentTest() {
        // Given
        double expected = -2.185039863261519;
        SciCalculator.setCurrentValue(2.0);
        // When
        double actual = trigFunction.tangent();
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void inverseSineTest() {
        // Given
        double expected = 1.5707963267948966;
        SciCalculator.setCurrentValue(1.0);
        // When
        double actual = trigFunction.inverseSine();
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void inverseCosineTest() {
        // Given
        double expected = 0.0;
        SciCalculator.setCurrentValue(1.0);
        // When
        double actual = trigFunction.inverseCosine();
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void inverseTangentTest() {
        // Given
        double expected = 0.7853981633974483;
        SciCalculator.setCurrentValue(1.0);
        // When
        double actual = trigFunction.inverseTangent();
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

}