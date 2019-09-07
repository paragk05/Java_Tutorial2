package com.learnit.java;

public class BMW implements Car,Loggable,Property,Asset
{
    public void drive()
    {
        System.out.println("BMW driving");
    }

    public int value()
    {
        return 8000;
    }
    public String owner()
    {
        return "Parag";
    }

    public String message() {
        return "I am The car of Parag";
    }
}
