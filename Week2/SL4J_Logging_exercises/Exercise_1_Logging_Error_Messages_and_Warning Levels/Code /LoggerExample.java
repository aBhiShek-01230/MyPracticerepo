package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggerExample.class);

    public void doSomething(int value) {
        if (value < 0) {
            logger.error("Negative value provided: {}", value);  // Error-level log
        } else if (value == 0) {
            logger.warn("Zero value might not be valid.");       // Warning-level log
        } else {
            logger.info("Received value: {}", value);            // Optional: Info-level
        }
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();

        example.doSomething(-1);  
        example.doSomething(0);   
        example.doSomething(5);  
    }
}
