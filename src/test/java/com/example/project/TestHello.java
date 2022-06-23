package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

// Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal
// places.

public class TestHello {
    /*
   @Test
   public void testHelloWorld()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Hello.main(null);

     // assertion
     assertEquals("Hello world!\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }
    */

    @Test
    public void testFloatingPointOne()
    {
        double x = 250.2578;
        double y = 258.2579;

        boolean chkFlag = Hello.floatingPointComparison(x, y);
        assertEquals(chkFlag, false);
    }

    @Test
    public void testFloatingPointTwo()
    {
        double x = -105.7509;
        double y = 230.7508;

        boolean chkFlag = Hello.floatingPointComparison(x, y);
        assertEquals(chkFlag, false);
    }

    @Test
    public void testFloatingPointThree()
    {
        double x = 99.230;
        double y = 99.2301;

        boolean chkFlag = Hello.floatingPointComparison(x, y);
        assertEquals(chkFlag, true);
    }

    @Test
    public void testFloatingPointFour()
    {
        double x = 99.23;
        double y = 99.2301;

        boolean chkFlag = Hello.floatingPointComparison(x, y);
        assertEquals(chkFlag, true);
    }

}
