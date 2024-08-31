package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new ChromeDriver();
		String pw=dr.getWindowHandle();
		
		dr.get("https://demo.guru99.com/v4/");
		dr.switchTo().newWindow(WindowType.TAB);
		
		String str=dr.getWindowHandle();
		dr.get("https://www.saucedemo.com");
		dr.switchTo().newWindow(WindowType.TAB);
		
		dr.get("https://codenboxautomationlab.com/registration-form/");
		dr.switchTo().window(pw);
		
		String str1=dr.getWindowHandle();
		dr.get("https://www.saucedemo.com");
		Thread.sleep(2000);
		dr.switchTo().window(str);
		
		String str2=dr.getWindowHandle();
		dr.get("https://www.saucedemo.com");
		Thread.sleep(2000);
		dr.switchTo().window(pw);
		
		

	}

}
