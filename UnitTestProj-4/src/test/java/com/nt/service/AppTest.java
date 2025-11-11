package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	private static MoreOperations service;
	@BeforeAll
	public static void setUp()
	{
		System.out.println("AppTest::setUp()");
		service=new MoreOperations();
	}
	
	
	@Test
	public void testPalindromeWithValidData()
	{
		String msg="mom";
		assertTrue(service.isPalindrome(msg));
	}
	
	@Test
	public void testPalindromeWithInValidData()
	{
		String msg="kalyan";
		assertFalse(service.isPalindrome(msg));
	}
	
	@Test
	public void showDateByInValidMonth()
	{
		Date actual=service.showDateByMonth(-1);
		assertNull(actual);
	}
	
	@Test
	public void showDateByValidMonth()
	{
		Date actual=service.showDateByMonth(1);
		assertNotNull(actual);
	}
	
	@Test
	public void testSingletonRuntime()
	{
		Runtime time1=Runtime.getRuntime();
		Runtime time2=Runtime.getRuntime();
		assertSame(time1,time2);
	}
	
	@Test
	public void testSingletonLocalDate()
	{
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2022, 11, 03);
		assertNotSame(date1,date2);
	}
	
	@AfterAll
	public static void tearDown()
	{
		System.out.println("AppTest::tearDown()");
		service=null;
	}
}
