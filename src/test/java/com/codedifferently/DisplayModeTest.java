package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class DisplayModeTest {

    DisplayMode dm;

    @Before
    public void setup() {
        this.dm = new DisplayMode();
    }

    @Test
    public void binaryTest() {
        // Given
        dm.switchDisplayMode("binary");
        int actual = dm.getMode();
        // When
        int expected = 0;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void octalTest() {
        // Given
        dm.switchDisplayMode("octal");
        int actual = dm.getMode();
        // When
        int expected = 0;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decimalTest() {
        // Given
        dm.switchDisplayMode("decimal");
        int actual = dm.getMode();
        // When
        int expected = 0;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hexadecimalTest() {
        // Given
        dm.switchDisplayMode("hexadecimal");
        int actual = dm.getMode();
        // When
        int expected = 0;
        // Then
        Assert.assertEquals(expected, actual);
    }
}
