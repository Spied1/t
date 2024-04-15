package com.spring.Starter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
    @GetMapping(path = "/hello")
    public String say_hello()
    {
        return "testPage.html";
    }
}
