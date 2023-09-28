package by.flameksandr.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {

    @GetMapping("/calculate")
    public String calculate(@RequestParam("a") int a,
                            @RequestParam("b") int b,
                            @RequestParam("action") String op,
                            Model model) {

        double result;
        switch (op) {
            case ("sub") -> result = a - b;
            case ("add") -> result = (double)a + b;
            case ("mul") -> result = a * b;
            case ("div") -> result = (double) a / (double) b;
            default -> result = 0;
        }
        model.addAttribute("result", result);

                return "calculator/calculate";
    }
}
