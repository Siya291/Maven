package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void testAddNums() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.addNums(2, 3));
    }
}