package com.codedifferently;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class TrigUnitTest {

    TrigUnit trigUnit;

    @Before
    public void setup() {
        this.trigUnit = new TrigUnit();
    }

    @Test
    public void switchDisplayModeTest1() {
        // when
        trigUnit.switchDisplayMode();

        // then
        boolean actual = trigUnit.getCurrentDisplay();
        Assert.assertTrue(actual);
    }

    @Test
    public void switchDisplayModeTest2() {
        // when
        trigUnit.switchDisplayMode("radians");

        // then
        boolean actual = trigUnit.getCurrentDisplay();
        Assert.assertTrue(actual);
    }
}