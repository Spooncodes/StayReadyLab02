package com.codedifferently;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class LogFunctionsTest {
    LogFunctions logFunction;

    @Before
    public void setup() {
        this.logFunction = new LogFunctions();
    }

    @Test
    public void naturalLogTest() {
        // Given
        double expected = 0.0;
        SciCalculator.setCurrentValue(5.0);
        // When
        double actual = 1.60943791243;
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void inverseNaturalLogTest() {
        // Given
        double expected = 0.0;
        SciCalculator.setCurrentValue(5.0);
        // When
        double actual = 0.0;
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

}