package com.learnit.java;

public class Porsche implements Car
{
    public Porsche(String parag) {
    }

    public Porsche() {

    }

    public void drive()
    {
        System.out.println("Porsche driving");
    }

    @Override
    public Porsche clone()
    {
        try {
            return (Porsche)super.clone();
        } catch (CloneNotSupportedException e) {

            throw new AssertionError();
        }
    }

}
