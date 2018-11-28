package com.AmazonUtil;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoHighLight {

	WebDriver driver;

	public DoHighLight(WebDriver driver) {
		this.driver = driver;
	}

	public void drawBorder(WebElement element, String color) {
		WebElement element_node = element;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].style.border='5px solid " + color + "'", element_node);
	}

}
