package com.learnit.java;

public class Porsche implements Car
{
    IOReader ioReader= new IOReader();
    public void drive()
    {
        System.out.println("Porsche driving");
    }

    public void finalize()
    {
        ioReader.close();
    }
}
