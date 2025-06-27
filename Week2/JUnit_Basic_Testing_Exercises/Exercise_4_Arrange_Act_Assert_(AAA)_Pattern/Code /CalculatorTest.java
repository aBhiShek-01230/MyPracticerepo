import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {

    Calculator calc;

    @BeforeAll
    void initAll() {
        System.out.println("== Starting Calculator Test Suite ==");
    }

    @BeforeEach
    void init() {
        calc = new Calculator(); // Arrange
        System.out.println("Setting up test...");
    }

    @Test
    void testAddition() {
        int result = calc.add(2, 3); // Act
        assertEquals(5, result);     // Assert
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after test...\n");
    }

    @AfterAll
    void tearDownAll() {
        System.out.println("== All tests complete ==");
    }
}
