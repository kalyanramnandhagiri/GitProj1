package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestArithemeticOperations 
{
	private static ArithemeticOperations ar;
	@BeforeAll
	public static void setup()
	{
		System.out.println("TestArithemeticOperations::setup()");
		ar=new ArithemeticOperations();
	}
	
	@Test
	public void testWithPositives()
	{
		System.out.println("TestArithemeticOperations::testWithPositives()");
		int val1=10;
		int val2=30;
		int expected=40;
		int actual=ar.sum(val1, val2);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithNegatives()
	{
		System.out.println("TestArithemeticOperations::testWithNegatives()");
		int val1=-20;
		int val2=-30;
		int expected=-50;
		int actual=ar.sum(val1, val2);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithZeroes()
	{
		System.out.println("TestArithemeticOperations::testWithZeroes()");
		int val1=0;
		int val2=0;
		int expected=0;
		int actual=ar.sum(val1, val2);
		assertEquals(expected,actual);
	}
	
	@Test
	@Disabled
	public void testWithMixedValues()
	{
		System.out.println("TestArithemeticOperations::testWithMixedValues()");
		int val1=-50;
		int val2=80;
		int expected=30;
		int actual=ar.sum(val1, val2);
		assertEquals(expected,actual,"Test With Mixed");
	}
	
	@AfterAll
	public static void  tearDown()
	{
		System.out.println("TestArithemeticOperations::tearDown()");
		ar=null;
	}
	
}
