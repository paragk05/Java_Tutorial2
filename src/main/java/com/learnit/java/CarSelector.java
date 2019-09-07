package com.learnit.java;

import java.io.IOException;

public class CarSelector
{
    public static void main(String []p)
    {
        CarServices carServices=new CarServices();
        for (String args: p)
        {
            if (isValidate(args))
            {
                carServices.process(args);
            }
            else
            {
                System.err.println("Ignoring Invalid Argument "+args);
            }


        }
    }

    private static boolean isValidate(String args)
    {
        try
        {
            CarState carState = CarState.valueOf(args);
            return true;
        }
        catch (IllegalArgumentException e)
        {
            return false;
        }
        finally
        {


        }
    }
}
