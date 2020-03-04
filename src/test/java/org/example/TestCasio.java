package org.example;

import org.junit.Assert;
import org.junit.Test;

public class TestCasio {

    @Test
public void TestAnsForAdd() {
            Calculator calculator = new Casio();
            BasicCalc cas = new Casio();

            // When
            int ans = calculator.add(2, 2);
            // Then
            if (ans != 4) {
                Assert.fail();
            }
        }

    @Test
    public void testSubtract() {
        Calculator calculator = new Casio();
        Assert.assertEquals(20, calculator.multiply(22, 2));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Casio();
        Assert.assertEquals(90, calculator.multiply(45, 2));
    }

    @Test
    public void testMin() {
        Calculator calculator = new Casio();
        Assert.assertEquals(8, calculator.min(10, 8));
    }

    @Test
    public void testCrossSum() {
        Calculator calculator = new Casio();
        Assert.assertEquals(200, calculator.multiply(20, 10));
    }

}
