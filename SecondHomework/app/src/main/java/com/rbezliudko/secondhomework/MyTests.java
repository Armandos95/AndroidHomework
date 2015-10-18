package com.rbezliudko.secondhomework;

import junit.framework.TestCase;

public class MyTests extends TestCase {
    public void test() throws Exception{
        assertEquals(1, SecondHomeworkActivity.getFibonacciNumber(1));
        assertEquals(8l, SecondHomeworkActivity.getFibonacciNumber(6));
        assertEquals(10946l, SecondHomeworkActivity.getFibonacciNumber(21));
        assertEquals(1l, SecondHomeworkActivity.getFactorial(0));
        assertEquals(720l, SecondHomeworkActivity.getFactorial(6));
        assertEquals(3628800l, SecondHomeworkActivity.getFactorial(10));
    }
}
