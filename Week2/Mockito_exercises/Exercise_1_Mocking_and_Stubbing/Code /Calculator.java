package com.example;

public class Calculator {
    private ExternalService service;

    public Calculator(ExternalService service) {
        this.service = service;
    }

    public int computeSum(int a, int b) {
        return service.add(a, b);
    }
}
