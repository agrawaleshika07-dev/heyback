package com.example.cld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class AwsController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from AWS!";
    }
}
