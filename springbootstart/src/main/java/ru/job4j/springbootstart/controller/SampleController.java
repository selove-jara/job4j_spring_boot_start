package ru.job4j.springbootstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }
}