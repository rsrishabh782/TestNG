package com.practise.selenium.v1;


import org.testng.Assert;
import org.testng.annotations.Test;


public class exampleDependent {
	@Test
	public void test() {

		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = {"test"})
	public void test1() {

		System.out.println("test2 pass");

	}

	@Test(dependsOnMethods = {"test", "test1"})
	public void test2() {

		System.out.println("test3 pass");

	}
	@Test
	public void test3() {

		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods = {"test3"})
	public void test4() {

		System.out.println("test3 pass");

	}
}
