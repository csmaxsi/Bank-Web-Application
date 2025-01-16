package  com.bank.financewebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController{
    
    @GetMapping("/financewebapp")
    public String hello(){
        return "Hello World";
    }
}