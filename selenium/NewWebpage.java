package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewWebpage {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		//open url
		dr.get("https://demo.guru99.com/v4/");
		//maximize the window
		dr.manage().window().maximize();
		//get title
//		String str="https://www.google.com";
//		String str1="https://www.firefox.com";
//		if((str=dr.getTitle())==(str1=dr.getTitle()))
//		{
//			System.out.println("str and str1 are same:");	
//		}
//		else {
//			System.out.println("str and str1 are not same");
//		}
		//open new tab
		String str2=dr.getWindowHandle();
		dr.get("https://demo.automationtesting.in/Register.html");
		dr.switchTo().window(str2);
		//switch back
//		String str3=dr.getWindowHandle();
//		dr.get("https://demo.guru99.com/v4/");
//		dr.switchTo().window(str3);
		//get current url
	    dr.getCurrentUrl();
	    //enter fname & lname
	    WebElement we1=dr.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
	    we1.click();
	    we1.sendKeys("shivanjali");
	    WebElement we2=dr.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	    we2.click();
	    we2.sendKeys("gadekar");
	    //phone number
	    WebElement we3=dr.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
	    we3.click();
	    we3.sendKeys("8605415978");
	    //email nd address
		dr.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("shiv@gmail.com");
		dr.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("baramati");
		//radio button
		dr.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]")).click();
		dr.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]")).click();
		//date & birth
		WebElement drop=dr.findElement(By.xpath("//*[@id=\"yearbox\"]"));
		Select slt=new Select(drop);
		slt.selectByIndex(3);
		
		WebElement drop1=dr.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select slt1=new Select(drop1);
		slt1.selectByIndex(3);
		
		WebElement drop2=dr.findElement(By.xpath("//*[@id=\"daybox\"]"));
		Select slt2=new Select(drop2);
		slt2.selectByIndex(3);
		//password
		dr.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("12345678@");
		//submit button
		dr.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();

	}

}
