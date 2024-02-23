package com.practise.selenium.v1;

import org.testng.annotations.Test;

public class examplePriority {
  @Test(priority = 0)
  public void Test() {
	  System.out.println("priority = 0");
  }
  
  @Test(priority = 2)
  public void Test1() {
	  System.out.println("priority = 2");
  }
  
  @Test(priority = 1)
  public void Test2() {
	  System.out.println("priority = 1");
  }

}
