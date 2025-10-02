package tn.romdhani.managementsystem.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "API is working!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }
}