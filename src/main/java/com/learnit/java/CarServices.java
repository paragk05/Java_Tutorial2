package com.learnit.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarServices
{
    private final Logger log= LoggerFactory.getLogger(CarServices.class);

    public void process(String input)
    {
        CarState carState=CarState.from(input);
        System.out.println("Valid States :"+carState);
    }
}
