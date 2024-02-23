package com.practise.selenium.v1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class exampleParameter1 {

	@Test
	@Parameters("myname")
	public void parameterTest(String myname)
	{
		System.out.println("Parametes is " +myname);
	}
}
