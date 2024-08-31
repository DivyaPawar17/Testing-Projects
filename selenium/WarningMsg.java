package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WarningMsg {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.guru99.com/v4/");
		
		WebElement we=dr.findElement(By.name("uid"));
		we.click();
		WebElement we1=dr.findElement(By.name("password"));
		we1.click();
		WebElement we2=dr.findElement(By.id("message23"));
		we2.click();
		
		String s=we2.getText();
		System.out.println(s);
		
		WebElement m=dr.findElement(By.id("message18"));
		String s1=m.getText();
		System.out.println(s1);
	}

}
