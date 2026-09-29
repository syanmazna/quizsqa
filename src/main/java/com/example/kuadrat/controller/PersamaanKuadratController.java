package com.example.kuadrat.controller;

import com.example.kuadrat.service.PersamaanKuadratService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersamaanKuadratController {

    private final PersamaanKuadratService persamaanKuadratService;

    public PersamaanKuadratController(PersamaanKuadratService persamaanKuadratService) {
        this.persamaanKuadratService = persamaanKuadratService;
    }

    @GetMapping("/hitung")
    public String hitung(
            @RequestParam("a") double a,
            @RequestParam("b") double b,
            @RequestParam("c") double c) {
        return persamaanKuadratService.hitung(a, b, c);
    }
}
