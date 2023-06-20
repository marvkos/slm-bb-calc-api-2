package at.technikum.slmbbcalcapi2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/calc/add")
    public int add(
        @RequestParam int a,
        @RequestParam int b
    ) {
        return a + b;
    }

    asidwd;
}
