package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class InspectAll {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.get("https://codenboxautomationlab.com/registration-form/");
		
		dr.findElement(By.name("fname")).sendKeys("shivanjali");
		dr.findElement(By.name("lname")).sendKeys("gadekar");
		dr.findElement(By.name("email")).sendKeys("shiv@gmail.com");
		
		WebElement drop=dr.findElement(By.id("nf-field-20"));
		Select slt=new Select(drop);
		slt.selectByIndex(3);
		slt.selectByValue("SDLC");
		
	}

}
