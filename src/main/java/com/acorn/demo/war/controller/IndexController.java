package com.acorn.demo.war.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Value("${acorn.message}")
    private String acornMessage;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Welcome Acorn! Profile: " + acornMessage;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, World!";
    }
}
