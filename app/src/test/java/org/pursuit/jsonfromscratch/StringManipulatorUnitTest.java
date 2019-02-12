package org.pursuit.jsonfromscratch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringManipulatorUnitTest {
    private StringManipulator stringManipulator;

    @Before
    public void setStringManipulator(){}

    @Test
    public void isLessThan10(){
    String str = "aaa";
    Assert.assertTrue(stringManipulator.isLessThan10(str));
    }
}
