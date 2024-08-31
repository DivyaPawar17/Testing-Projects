package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkname {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.saucedemo.com");
		
		WebElement we;
		we=dr.findElement(By.name("user-name"));
		we.click();
		we.sendKeys("standard_user");
		
		we=dr.findElement(By.name("password"));
		we.click();
		we.sendKeys("secret_sauce");
		
		String s=we.getAttribute("value");
		System.out.println(s);
		
		String s1=we.getAttribute("value");
		System.out.println(s1);
	}
}
