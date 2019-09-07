package com.learnit.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarServices
{

    public void drive()
    {

        Car [] cars={ new BMW(),new Porsche(),new Mercedes()};

        for (Car car:cars)
        {
          car.drive();
        }

    }
}
