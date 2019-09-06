package com.learnit.java;

public class CarSelector
{
    public static void main(String []p)
    {
        CarServices carServices=new CarServices();
        for (String args: p)
        {
            carServices.process(args);
        }
    }
}
