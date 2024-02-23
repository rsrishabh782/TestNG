package com.practise.selenium.v1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class exampleAnnotation1 {


	@BeforeSuite
	public void test1()
	{
		System.out.println("@BeforeSuite");
	}

	@BeforeTest
	public void test2()
	{
		System.out.println("@BeforeTest");
	}

	@Test
	public void test21()
	{
		System.out.println("@Test1");
	}

	
	@org.testng.annotations.BeforeClass
	public void test3()
	{
		System.out.println("@BeforeClass");
	}

	@BeforeMethod
	public void test4()
	{
		System.out.println("@BeforeMethod");
	}


	@Test
	public void test5()
	{
		System.out.println("@Test");
	}


	@AfterMethod
	public void test6()
	{
		System.out.println("@AfterMethod");
	}

	@org.testng.annotations.AfterClass
	public void test7()
	{
		System.out.println("@AfterClass");
	}

	@AfterTest
	public void test8()
	{
		System.out.println("@AfterTest");
	}

	@AfterSuite
	public void test9()
	{
		System.out.println("@AfterSuite");
	}
}
