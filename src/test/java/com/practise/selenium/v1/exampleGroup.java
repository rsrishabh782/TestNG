package com.practise.selenium.v1;

import org.testng.annotations.Test;

public class exampleGroup {
	@Test(groups = {"Sanity"})
	public void Test() {

		System.out.println("Sanity");
	}

	@Test(groups = {"Sanity", "Regression"})
	public void Test1() {

		System.out.println("Sanity, Regression");
	}

	@Test(groups = {"Regression"})
	public void Test2() {

		System.out.println("Regression");

	}


}
