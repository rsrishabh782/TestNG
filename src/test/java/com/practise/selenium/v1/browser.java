package com.practise.selenium.v1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class browser {
  @Test
  public void f() {
	  
	  WebDriver driver;
		
		//System.setProperty( "webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty( "webdriver.edge.driver", "C:\\Users\\RISHABH SRIVASTAVA\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		
		 // driver = new ChromeDriver();
		  
		  driver = new EdgeDriver();
		
		 driver.manage().window().maximize();
		// driver.get("https://www.google.com");
		 
		 driver.get("https://semantic-ui.com/modules/dropdown.html");
		 /*
		 WebElement el = driver.findElement(By.xpath("(//div[@class='DPXIy'])/textarea"));
		 el.click();
		 el.sendKeys(new String[]{"Test"});*/
		 
		 WebElement drop = driver.findElement(By.xpath("(//div[@class='text'])[1]"));
		// Select se = new Select(drop);
		// se.selectByVisibleText("File");
		 
		 Actions action = new Actions(driver);
		 action.moveToElement(drop).build().perform();
		 action.moveToElement(drop).click();
		 
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
  }

