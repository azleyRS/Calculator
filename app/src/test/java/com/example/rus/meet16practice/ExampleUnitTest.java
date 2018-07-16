package com.example.rus.meet16practice;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void GetStringFromCalculatorTest(){
        String result = new Calculator().evaluate("25","31",'+');
        assertEquals(result,"56.0");
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test public void addTest(){
        Double value = 25.0;
        Double val2 = Calculator.add(20.0,5.0);
        assertEquals(value, val2);
    }
}