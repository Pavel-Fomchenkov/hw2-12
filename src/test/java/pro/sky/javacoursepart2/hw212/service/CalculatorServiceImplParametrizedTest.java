package pro.sky.javacoursepart2.hw212.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParametrizedTest {

    CalculatorService out = new CalculatorServiceImpl();

    private static Stream<Arguments> paramsProviderForTest() {
        return Stream.of(
                Arguments.of(25, 78,
                        "25 + 78 = 103",
                        "25 - 78 = -53",
                        "25 * 78 = 1950",
                        "25 / 78 = 0"),
                Arguments.of(-46, -241,
                        "-46 + -241 = -287",
                        "-46 - -241 = 195",
                        "-46 * -241 = 11086",
                        "-46 / -241 = 0"),
                Arguments.of(0, 452,
                        "0 + 452 = 452",
                        "0 - 452 = -452",
                        "0 * 452 = 0",
                        "0 / 452 = 0"),
                Arguments.of(-54, 19,
                        "-54 + 19 = -35",
                        "-54 - 19 = -73",
                        "-54 * 19 = -1026",
                        "-54 / 19 = -2")
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProviderForTest")
    void addMethodTestWithParams(Integer num1, Integer num2, String addExpected) {
        assertEquals(out.add(num1, num2), addExpected);
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProviderForTest")
    void subtractMethodTestWithParams(Integer num1, Integer num2, String addExpected, String subtractExpected) {
        assertEquals(out.subtract(num1, num2), subtractExpected);
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProviderForTest")
    void multiplyMethodTestWithParams(Integer num1, Integer num2, String addExpected, String subtractExpected, String multiplyExpected) {
        assertEquals(out.multiply(num1, num2), multiplyExpected);
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProviderForTest")
    void multiplyMethodTestWithParams(Integer num1, Integer num2, String addExpected, String subtractExpected, String multiplyExpected, String divideExpected) {
        assertEquals(out.divide(num1, num2), divideExpected);
    }
}