package org.progre.testdemo.hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2 {
    @GetMapping("/test2")
    public String hello() {
        return "Hello Super Coding World222";
    }
}
