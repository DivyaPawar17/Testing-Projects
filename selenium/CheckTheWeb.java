package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheWeb {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.saucedemo.com");
		WebElement we;
		we=dr.findElement(By.name("user-name"));
		we.click();
		we.sendKeys("standard_user");
		
		we=dr.findElement(By.name("password"));
		we.click();
		we.sendKeys("secret_sauce");
		
		
		
//		we1.sendKeys("asddgf");
//		we1.clear();
		//we1.sendKeys("gadekar");
		
		WebElement we2;
	    we2=dr.findElement(By.name("login-button"));
		we2.click();
		
		we2=dr.findElement(By.id("react-burger-menu-btn"));
		we2.click();
		Thread.sleep(1000);
		we2=dr.findElement(By.id("logout_sidebar_link"));
		we2.click();
		
		
		

	}

}
