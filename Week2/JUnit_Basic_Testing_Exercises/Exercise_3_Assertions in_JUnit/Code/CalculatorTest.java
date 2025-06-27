import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3), "2 + 3 should equal 5");
        assertNotEquals(6, calc.add(2, 3), "2 + 3 should not equal 6");
    }

    @Test
    void testDivision() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0), "Division by zero should throw");
    }

    @Test
    void testGroupAssertions() {
        Calculator calc = new Calculator();
        assertAll("Grouped assertions for add()",
            () -> assertEquals(5, calc.add(2, 3)),
            () -> assertEquals(0, calc.add(-1, 1)),
            () -> assertNotNull(calc)
        );
    }

    @Test
    void testBooleans() {
        assertTrue(3 > 2);
        assertFalse(2 > 3);
    }
}
