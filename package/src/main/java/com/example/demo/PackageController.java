package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackageController {
    @GetMapping("/test")
    public int test(){
        return 2;
    }
}
