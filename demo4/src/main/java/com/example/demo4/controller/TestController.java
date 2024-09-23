package com.example.demo4.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping("hello")
    public String testHello(Model model, HttpSession session) {
        return "hellothymeleaf";
    }
}
