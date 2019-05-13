package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/")
    public String home(){
        return "index intern was here, sorry";
    }

}
