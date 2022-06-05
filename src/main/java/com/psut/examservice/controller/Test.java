package com.psut.examservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Test {

    @GetMapping(value="hello")
    @ResponseBody
    public String hello() {
        return "Hello";
    }
}
