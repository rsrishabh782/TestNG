package com.practise.selenium.v1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class exampleAnnotation {

	@BeforeSuite
	public void test1()
	{
		
	}
	
	@BeforeClass
	public void test2()
	{
		
	}
	
	@BeforeMethod
	public void test3()
	{
		
	}
	
	@BeforeTest
	public void test4()
	{
		
	}
	
	@Test
	public void test5()
	{
		
	}
	
	@AfterTest
	public void test6()
	{
		
	}
	
	@AfterMethod
	public void test7()
	{
		
	}
	
	@AfterClass
	public void test8()
	{
		
	}
	
	@AfterSuite
	public void test9()
	{
		
	}
}
