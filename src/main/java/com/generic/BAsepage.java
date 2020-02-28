package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BAsepage {
	
	public WebDriver driver;
	
	private static final int  Timeout=5;
	private static final int poling=100;
	public WebDriverWait wait;
	public BAsepage(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver,Timeout,poling);
		PageFactory.initElements(driver,this);
		
	}
	protected void waitForElementToAppear(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForElementToDisappear(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForTextToDisappear(By locator, String text) {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
    }

	

}
