package com.practise.selenium.v1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class windowHandle {
	@Test
	public void f() {
		WebDriver driver;

		System.setProperty( "webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://hclo365.sharepoint.com/sites/MYHCLTech");
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element = driver.findElement(By.xpath("//a[text()='https://sx.hcl.com']"));
		element.click();

		String parent = driver.getWindowHandle();
		Set<String> windowid = driver.getWindowHandles();

		Iterator<String> itr1 = windowid.iterator();

		while(itr1.hasNext())
		{
			String childwindow = itr1.next();

			if(!parent.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				System.out.println(driver.getTitle()); 
				driver.close();
			}

			driver.switchTo().window(parent);
			System.out.println(driver.getTitle());

		}
		 
		

		driver.close();
	}
}

