import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    public void testAddShouldReturn0() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void testAddShouldReturn1() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }

    @Test
    public void testAddShouldReturn3() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void testAddShouldReturn8() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(8, calculator.add("1,2,5"));
    }

    @Test
    public void testAddShouldReturn16() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(16, calculator.add("1,2,3,4,6"));
    }

    @Test
    public void testAddWithNewLineShouldReturn16() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(16, calculator.add("1\n2,3,4,6"));
    }

    @Test
    public void testAddWithSomeMoreDelimitersShouldReturn12() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(12, calculator.add("//###\\n1###2###3###6"));
    }
}
