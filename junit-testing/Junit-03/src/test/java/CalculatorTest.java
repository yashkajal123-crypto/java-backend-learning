
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {

        int result = calculator.add(10, 20);

        assertEquals(30, result);
    }

    @Test
    void testSubtraction() {

        int result = calculator.subtract(20, 10);

        assertEquals(10, result);
    }

    @Test
    void testMultiplication() {

        int result = calculator.multiply(5, 4);

        assertEquals(20, result);
    }

    @Test
    void testDivision() {

        int result = calculator.divide(20, 5);

        assertEquals(4, result);
    }

    @Test
    void testDivisionByZero() {

        assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );
    }
}