package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoreFeatureTest {

    CoreFeature coreFeature;

    @Before
    public void setup() {
        this.coreFeature = new CoreFeature();
    }

    @Test
    public void addTest() {
        // Given
        double expected = 4.0;
        SciCalculator.setCurrentValue(2.0);
        // When
        double actual = coreFeature.add(2.0);
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void subtractTest() {
        // Given
        double expected = 3.0;
        SciCalculator.setCurrentValue(5.0);
        // When
        double actual = coreFeature.subtract(2.0);
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void multiTest() {
        // Given
        double expected = 4.0;
        SciCalculator.setCurrentValue(2.0);
        // When
        double actual = coreFeature.multiply(2.0);
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void divisionTest() {
        // Given
        double expected = 3.0;
        SciCalculator.setCurrentValue(6.0);
        // When
        double actual = coreFeature.divide(2.0);
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void exponentTest() {
        // Given
        double expected = 8.0;
        SciCalculator.setCurrentValue(2.0);
        // When
        double actual = coreFeature.exponent(3.0);
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void rootTest() {
        // Given
        double expected = 3.0;
        SciCalculator.setCurrentValue(9.0);
        // When
        double actual = coreFeature.root();
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void squareTest() {
        // Given
        double expected = 9.0;
        SciCalculator.setCurrentValue(3.0);
        // When
        double actual = coreFeature.square();
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void inverseTest() {
        // Given
        double expected = 0.25;
        SciCalculator.setCurrentValue(4.0);
        // When
        double actual = coreFeature.inverse();
        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void switchSignTest1() {
        // Given
        double expected = -4.0;
        SciCalculator.setCurrentValue(4.0);
        // When
        double actual = coreFeature.switchSign();
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void switchSignTest2() {
        // Given
        double expected = 4.0;
        SciCalculator.setCurrentValue(-4.0);
        // When
        double actual = coreFeature.switchSign();
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }
}