package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Username {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.guru99.com/v4/");
		
//		dr.findElement(By.name("uid")).sendKeys("shivanjali");
//		dr.findElement(By.name("password")).sendKeys("12345678@");
//		dr.findElement(By.name("btnLogin")).click();
		
//		dr.findElement(By.linkText("here")).click();
		dr.findElement(By.partialLinkText("href")).click();
	}

}
