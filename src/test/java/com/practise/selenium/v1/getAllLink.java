package com.practise.selenium.v1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getAllLink {
	@Test
	public void f() {

		WebDriver driver;

		System.setProperty( "webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		ArrayList<String> data = new ArrayList<String>();

		for (int i =0; i<links.size(); i++)
		{
			System.out.println(links.get(i).getText());
			data.add(links.get(i).getAttribute("href"));
			System.out.println(links.get(i).getAttribute("href"));
		}

		System.out.println(data.size());
		driver.close();

	}


	public static void brokenlink(String linkurl)
	{
		try {
			URL url = new URL(linkurl);

			HttpURLConnection httpurlconnet = (HttpURLConnection)url.openConnection();
			httpurlconnet.setConnectTimeout(5000);
			httpurlconnet.connect();
			
			if(httpurlconnet.getResponseCode()>=400)
			{
				System.out.println(linkurl+"-"+httpurlconnet.getResponseMessage()+"is broken link");
			
			}
			else {
				System.out.println(linkurl+"-"+httpurlconnet.getResponseMessage()+"is correct link");
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}	
}
