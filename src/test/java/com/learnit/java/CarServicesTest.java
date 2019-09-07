package com.learnit.java;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CarServicesTest
{
//    @Test
//    public void shouldDemonstrateLogging()
//    {
//        CarServices carServices=new CarServices();
//        carServices.process("BMW");
//    }
    @Test
    public void shouldDemonstrateInterface()
    {
        CarServices carServices=new CarServices();
        carServices.drive();
    }
}
