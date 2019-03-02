package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingsController {

    @GetMapping
    public String a(){

        return "wellcome";
    }
}
