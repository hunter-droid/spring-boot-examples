package spring.boot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/helloWorld")
    public String Hello() {
        return "Hello World!";
    }
}
