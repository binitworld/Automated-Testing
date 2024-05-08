import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ComplexCalculatorTest {

    @Test
    public void testAdd() {
        ComplexCalculator calculator = new ComplexCalculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(10, calculator.add(5, 5));
        assertEquals(-3, calculator.add(-6, 3));
        
    }

    @Test
    public void testSubtract() {
        ComplexCalculator calculator = new ComplexCalculator();
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(0, calculator.subtract(5, 5));
        assertEquals(-9, calculator.subtract(-6, 3));
        
    }

    @Test
    public void testMultiply() {
        ComplexCalculator calculator = new ComplexCalculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-15, calculator.multiply(5, -3));
        assertEquals(0, calculator.multiply(0, 5));
        
    }

    @Test
    public void testDivide() {
        ComplexCalculator calculator = new ComplexCalculator();
        assertEquals(2.0, calculator.divide(6, 3), 0.0001);
        assertEquals(-1.5, calculator.divide(-6, 4), 0.0001);
        
        try {
            calculator.divide(6, 0);
            fail("Expected IllegalArgumentException for division by zero");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero!", e.getMessage());
        }
    }

    @Test
    public void testIsPrime() {
        ComplexCalculator calculator = new ComplexCalculator();
        assertTrue(calculator.isPrime(2));
        assertTrue(calculator.isPrime(7));
        assertFalse(calculator.isPrime(1));
        assertFalse(calculator.isPrime(0));
        assertFalse(calculator.isPrime(-5));
        
    }
    
    @Test
    public void testIsNonPrime() {
        ComplexCalculator calculator = new ComplexCalculator();
    	assertFalse(calculator.isPrime(6));
    	assertFalse(calculator.isPrime(4));
    }
    
    @Test
    public void testFibonacciSeries() {
        ComplexCalculator calculator = new ComplexCalculator();
        assertArrayEquals(new int[]{0, 1, 1, 2, 3}, calculator.fibonacciSeries(5));
        assertArrayEquals(new int[]{0}, calculator.fibonacciSeries(1));
        assertArrayEquals(new int[]{0, 1}, calculator.fibonacciSeries(2));
        
    }
}
