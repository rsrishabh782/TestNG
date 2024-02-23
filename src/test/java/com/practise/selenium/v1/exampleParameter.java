package com.practise.selenium.v1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class exampleParameter {
	
	@Test
	@Parameters({"data"})
	public void test(@Optional("default") String data) {
		System.out.println(data);

	}

}

