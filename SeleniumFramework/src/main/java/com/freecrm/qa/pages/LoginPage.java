package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.TestBase;

public class LoginPage extends TestBase{
	//PageFactory or Object Repository

	@FindBy(name = "email")
	WebElement email;


	@FindBy(name ="pass")
	WebElement pass;


	@FindBy(id ="u_0_2")
	WebElement LogingButton;

	@FindBy(xpath="//i[contains(@class,'fb_logo img sp_QWp0VwOicFX sx_d3b7ee')]")
	WebElement LoginLogo;


	//initializing the Element of Factory 

	public LoginPage() {
		PageFactory.initElements(driver, this);

		//this == initalise the current object 
	}

	//Actions

	public String ValidateLoginPageTitle() {

		return driver.getTitle();
	}

	public Boolean ValidateLoginLogo() {

		return LoginLogo.isDisplayed();



	}

	public HomePage Login(String un, String pw) {

		email.sendKeys(un);
		pass.sendKeys(pw);
		LogingButton.click();

		return new HomePage();



	}

}


