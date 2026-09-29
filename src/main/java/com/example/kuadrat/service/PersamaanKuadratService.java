package com.example.kuadrat.service;

import org.springframework.stereotype.Service;

@Service
public class PersamaanKuadratService {

    public String hitung(double a, double b, double c) {
        double diskriminan = b * b - 4 * a * c;

        if (diskriminan > 0) {
            double akar1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
            double akar2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
            return "Akar real berbeda: x1 = " + akar1 + ", x2 = " + akar2;
        } else if (diskriminan == 0) {
            double akar = -b / (2 * a);
            return "Akar kembar: x = " + akar;
        } else {
            double bagianReal = -b / (2 * a);
            double bagianImajiner = Math.sqrt(-diskriminan) / Math.abs(2 * a);
            return "Akar imajiner: x1 = " + bagianReal + " + " + bagianImajiner
                    + "i, x2 = " + bagianReal + " - " + bagianImajiner + "i";
        }
    }
}
