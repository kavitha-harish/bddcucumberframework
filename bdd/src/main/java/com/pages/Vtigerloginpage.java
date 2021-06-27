package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vtigerloginpage {
	
	private WebDriver driver;
	
	//Vtiger login page locators
	private By username=By.name("user_name");
	private By password=By.name("user_password");
	private By login=By.id("submitButton");
	private By errormsg=By.xpath("//div[@class='errorMessage']");
	
	
	//constructor
	public Vtigerloginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	// 3. page actions: features(vtigerlogin) of the page the form of methods:
	public void enterusername(String un) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(un);
	}
	
	public void enterpassword(String pw) {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pw);
	}
	
	public void clickloginbtn() {
		driver.findElement(login).click();
	}
	
	public String errormessage() {
		return driver.findElement(errormsg).getText();
	}
	
	public boolean usernametf() {
		return driver.findElement(username).isDisplayed();
	}
	
	public boolean passwordtf() {
		return driver.findElement(password).isDisplayed();
	}

	
	

}
