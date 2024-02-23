package com.practise.selenium.v1;

import org.testng.Assert;
import org.testng.annotations.Test;



public class ExampleAssertions {
	@Test
	public void test() {

		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}
	@Test 
	public void test1() {


		Assert.assertTrue(false);
	}

	@Test 
	public void test2() {


		Assert.assertEquals("test", "test1");
	}
	
	@Test 
	public void test3() {


		Assert.assertEquals("test", "test");
	}
}
