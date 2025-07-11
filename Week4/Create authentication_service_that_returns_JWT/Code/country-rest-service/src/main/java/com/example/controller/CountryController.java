package com.example.controller;

import com.example.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CountryController {

    private static final Map<String, Country> countryMap = new HashMap<>();

    static {
        countryMap.put("in", new Country("in", "India", "New Delhi"));
        countryMap.put("us", new Country("us", "United States", "Washington, D.C."));
        countryMap.put("uk", new Country("uk", "United Kingdom", "London"));
        countryMap.put("jp", new Country("jp", "Japan", "Tokyo"));
    }

    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        Country country = countryMap.get(code.toLowerCase());
        if (country == null) {
            throw new RuntimeException("Country not found for code: " + code);
        }
        return country;
    }
}
