package devcalc;

import devcalc.service.CalculatorService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(15, service.add(10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, service.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, service.multiply(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, service.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> service.divide(10, 0));
    }
}
