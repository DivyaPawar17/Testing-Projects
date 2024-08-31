package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new ChromeDriver();
//		WebDriver dr1=new ChromeDriver();
//		String url="https://www.firefox.com";
//		dr.get(url);
		//or
//		dr.navigate().to(url);
		//or 
		//for open the web
		dr.get("https://www.google.com");   //for at time 2 web open 
		dr.get("https://www.firefox.com");
		//maximize the window
		dr.manage().window().maximize();
		dr.manage().window().maximize();
		//minimize the window
//		dr.manage().window().minimize();
//		dr1.manage().window().minimize();
//		
		String str="https://www.google.com";
		String str1="https://www.firefox.com";
		if((str=dr.getTitle())==(str1=dr.getTitle()))
		{
			System.out.println("str and str1 are same:");	
		}
		else {
			System.out.println("str and str1 are not same");
		}
//		String s=dr.getTitle();
//		String s1=dr.getTitle();
//		System.out.println("s");
		dr.navigate().back();
		Thread.sleep(5000);
		dr.navigate().forward();
//		dr.close();
	}

}
