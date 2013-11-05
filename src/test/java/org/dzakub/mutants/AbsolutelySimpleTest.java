package org.dzakub.mutants;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AbsolutelySimpleTest {
    private AbsolutelySimple sut;

    @BeforeTest
    public void createAndSetSUT() {
        sut = new AbsolutelySimple();
    }

    @DataProvider
    public Object[][] inputs() {
        return new Object [][] {
            { 1, 1, true },
            { 1, 0, false }
        };
    }

    @Test(dataProvider = "inputs")
    public void testIsProductPositive(int a, int b, boolean expectedResult) {
        Assert.assertEquals(sut.isProductPositive(a, b), expectedResult);
    }
}
