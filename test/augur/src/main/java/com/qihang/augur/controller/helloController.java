package com.qihang.augur.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping(value = "/hello")
    public  Object hello(){
        return "augur!!!";
    }

}
