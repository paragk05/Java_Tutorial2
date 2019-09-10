package com.learnit.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class PorscheTest
{
    @Test
    public void shouldCloneStringArray()
    {
        String []array={"one","two","three"};
        String [] coppiedArr=array.clone();
        assertSame(array,array);
        assertNotSame(array,coppiedArr);

        assertEquals("Porsche of Peter",coppiedArr);

    }

    @Test
    public void shouldClonePorsche()
    {
        Porsche porsche=new Porsche("Parag");

        Porsche peterPorsche=porsche.clone();

        assertNotSame(porsche,peterPorsche);
    }
}
