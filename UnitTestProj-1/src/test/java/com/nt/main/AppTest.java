package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testWithPositives()
    {
    	Arithemetic a=new Arithemetic();
    	float expected=30.0f;
    	float actual=a.sum(10.0f, 20.0f);
    	assertEquals(expected,actual);
    }
    
    
    @Test
    public void testWithNegatives()
    {
    	Arithemetic a=new Arithemetic();
    	float expected=-30.0f;
    	float actual=a.sum(-10.0f, -20.0f);
    	assertEquals(expected,actual);
    }
    
    @Test
    public void testWithZeroes()
    {
    	Arithemetic a=new Arithemetic();
    	float expected=0.0f;
    	float actual=a.sum(0.0f, 0.0f);
    	assertEquals(expected,actual);
    }
    
    @Test
    public void testWithMixedValues()
    {
    	Arithemetic a=new Arithemetic();
    	float expected=20.0f;
    	float actual=a.sum(-100.0f, 120.0f);
    	assertEquals(expected,actual);
    }
    
    @Test
    @Disabled
    public void testSumWithMixedValues()
    {
    	int val1=110;
    	int val2=-70;
    	int expected=40;
    	Arithemetic ar=new Arithemetic();
    	int actual=ar.sum(val1, val2);
    	assertEquals(expected,actual);
    	
    }
}
