package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentData {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.guru99.com/v4/");
		
		
		WebElement we=dr.findElement(By.name("uid"));
		we.click();
		
		

	}

}
