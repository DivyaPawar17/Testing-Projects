package com.selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebElement {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.guru99.com/v4/");
		//negative testing
//		dr.findElement(By.xpath("//input[@name='uid']")).sendKeys("shivanjali");
//		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("shiv");
//		dr.findElement(By.xpath("//input[@name='btnLogin']")).click();
		//Alert al=dr.switchTo().alert();
//		al.accept();
		//positive testing
		dr.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr266311");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678@");
		dr.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Alert al=dr.switchTo().alert();
		System.out.println(al.getText());
		

	}

}
