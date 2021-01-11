package com.mfanw.helloworld.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test Controller
 *
 * @author mengwei
 */
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello(@RequestParam("name") String name) {
        return "hello " + name;
    }
}
