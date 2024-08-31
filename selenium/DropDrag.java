package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDrag {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions act=new Actions(dr);
		WebElement we=dr.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement we1=dr.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(we, we1).build().perform();

	}

}
