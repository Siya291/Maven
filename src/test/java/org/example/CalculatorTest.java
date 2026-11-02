package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    Calculator calculator = new Calculator();

    @Test
    public void testAddNums() {
        assertEquals(5, calculator.addNums(2, 3));
    }

    @Test
    public void testMultiplyNums() {
        assertEquals(25, calculator.multiplyNums(5, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(4.0, calculator.divideNums(20, 5));
    }
}