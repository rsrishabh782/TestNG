package com.practise.selenium.v1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exampleDataProvider {

	@DataProvider
	public Object[][] testdata() {
		
		Object[][] data = new Object [2][2];
		
		data [0][0] = "test1";
		data [0][1] = "test2";
		
		data [1][0] = "test3";
		data [1][1] = "test4";
		
		return data;
	}
	@Test(dataProvider = "testdata")
	public void Test(String s1, String s2) {
		System.out.println("s1 " + ""+s1+" s2 " + ""+s2);
		
}
}
