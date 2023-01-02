import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    public void testThatSumWith1() {
        Assertions.assertEquals(1, calculator.sum(1));
    }

    @Test
    public void testThatSumWith3() {
        Assertions.assertEquals(6, calculator.sum(3));
    }

    @Test
    public void testThatSumThrowIllegalArgumentExceptionIf0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}