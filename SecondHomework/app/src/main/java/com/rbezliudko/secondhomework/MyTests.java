package com.rbezliudko.secondhomework;

import junit.framework.TestCase;

public class MyTests extends TestCase {
    public void test() throws Exception{
        SecondHomeworkActivity act = new SecondHomeworkActivity();
        assertEquals(1, act.getFibonacciNumber(1));
        assertEquals(8l, act.getFibonacciNumber(6));
        assertEquals(10946l, act.getFibonacciNumber(21));
        assertEquals(1l, act.getFactorial(0));
        assertEquals(720l, act.getFactorial(6));
        assertEquals(3628800l, act.getFactorial(10));
    }
}
