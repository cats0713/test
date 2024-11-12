package org.progre.testdemo.hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/test")
    public String hello() {
        return "Hello Super Coding World";
    }
}
