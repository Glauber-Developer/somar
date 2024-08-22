package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SomaController {

    @PostMapping("/somar")
    public int somar(@RequestParam int numero1, @RequestParam int numero2) {
        return numero1 + numero2;
    }
}
