package pro.sky.javacoursepart2.hw212.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String greetings() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String add(Integer num1, Integer num2) {
        catchNullArgument(num1, num2);
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String subtract(Integer num1, Integer num2) {
        catchNullArgument(num1, num2);
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        catchNullArgument(num1, num2);
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        catchNullArgument(num1, num2);
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

    private void catchNullArgument(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Необходимо ввести 2 числа.");
        }
    }
}
