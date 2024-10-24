
package ch.hslu.exercise.sw06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    /*
     * This test combines both numbers and should return the correct sum of 3.
     */
    @Test
    public void testIfAdditionReturnsTheSumOfBothNumbers() {
        assertEquals(3, calculator.addition(1.0f, 2.0f), "The method should return the sum of around 3");
    }

    /*
     * This test combines both negative numbers and should return the correct sum of -150.
     */
    @Test
    public void testIfAdditionReturnsTheSumOfBothNumbersWhenUsingNegativeNumbers() {
        assertEquals(-150, calculator.addition(-100f, -50f), "The method should return the sum of around -150");
    }

    /*
     * This test checks if correctly returns an NaN when number is not possible.
     */
    @Test
    public void testIfAdditionReturnsNaNWhenUsingNaN(){
        assertTrue(Float.isNaN(calculator.addition(33.4f, Float.NaN)));
        assertTrue(Float.isNaN(calculator.addition(Float.NaN, Float.NaN)));
    }

    /*
     * This test checks if still the same parameter is returned from the sum.
     */
    @Test
    public void testIfAdditionReturnsSameNumberWhenAdditingWithZero() {
        assertEquals(44.0f, calculator.addition(44.0f, 0.0f));
    }

    /*
     * This test checks if 0 is returned when both parameters are 0.
     */
    @Test
    public void testIfAdditionReturnsZeroWhenBothNumbersAreZero() {
        assertEquals(0.0f, calculator.addition(0.0f, 0.0f));
    }
}