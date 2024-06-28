package pro.sky.javacoursepart2.hw212.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    public void greetingsShouldReturnString() {
        String expected = "Добро пожаловать в калькулятор!";
        assertEquals(out.greetings(), expected);
    }

    @Test
    public void shouldReturnIllegalArgumentExceptionWhenAnyParameterDoesNotExist() {
        assertThrows(IllegalArgumentException.class, () -> out.add(null, -545877));
        assertThrows(IllegalArgumentException.class, () -> out.add(100, null));
    }

    @Test
    public void shouldReturnExpectedStringFromAddMethod() {
        assertEquals("-123 + 321 = 198", out.add(-123, 321));
        assertEquals("999 + -999 = 0", out.add(999, -999));
    }

    @Test
    public void shouldReturnExpectedStringFromSubtractMethod() {
        assertEquals("-987 - 987000 = -987987", out.subtract(-987, 987000));
        assertEquals("555 - 555 = 0", out.subtract(555, 555));
    }

    @Test
    public void shouldReturnExpectedStringFromMultiplyMethod() {
        assertEquals("-123 * 321 = -39483", out.multiply(-123, 321));
        assertEquals("999 * -999 = -998001", out.multiply(999, -999));
    }

    @Test
    public void shouldReturnExpectedStringFromDivideMethod() {
        assertEquals("-777 / 7 = -111", out.divide(-777, 7));
        assertEquals("999 / -333 = -3", out.divide(999, -333));
    }

    @Disabled // remove this annotation to run the test
    @Test
    public void shouldReturnIllegalArgumentExceptionWhenDividerIsZeroInDivideMethod() {
        assertThrows(IllegalArgumentException.class, () -> out.divide(0, 0));
        assertThrows(IllegalArgumentException.class, () -> out.divide(-404, 0));
    }

}