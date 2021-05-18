package com.openwiki.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    /**
     * Get, post, delete, put
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        return "Hello Wiki!";
    }
}
