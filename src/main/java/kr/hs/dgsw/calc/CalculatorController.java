package kr.hs.dgsw.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping
    public String getString(){
        return "Hello World";
    }
}
// e3c858130547fdff2220385eb17776667243bf37
