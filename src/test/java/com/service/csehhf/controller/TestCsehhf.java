package com.service.csehhf.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCsehhf {

        CsehhfDelegate csehhfDelegate = new CsehhfDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = csehhfDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}