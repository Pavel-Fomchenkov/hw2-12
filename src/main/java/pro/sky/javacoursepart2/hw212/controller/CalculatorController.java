package pro.sky.javacoursepart2.hw212.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.javacoursepart2.hw212.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping
    public String greetings() {
        return calculatorService.greetings();
    }

    @GetMapping("/plus")
    public String add(Integer num1, Integer num2) {
        return calculatorService.add(num1, num2);
    }

    @GetMapping("/minus")
    public String subtract(Integer num1, Integer num2) {
        return calculatorService.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(Integer num1, Integer num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(Integer num1, Integer num2) {
        return calculatorService.divide(num1, num2);
    }

}
