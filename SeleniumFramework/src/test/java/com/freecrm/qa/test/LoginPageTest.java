package com.freecrm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.TestBase;
import com.freecrm.qa.pages.HomePage;
import com.freecrm.qa.pages.LoginPage;



public class LoginPageTest extends TestBase{
	
	LoginPage lp;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void Setup() {

		initialization();

		lp = new LoginPage();
	}

	@Test
	public void loginPageTitleTest() {

		String tittle = lp.ValidateLoginPageTitle();
		Assert.assertEquals(tittle," Facebook");on 
	}


	@Test
	public void loginLogo() {

		boolean flag =lp.ValidateLoginLogo();
		Assert.assertTrue(true);
	}
		
		@Test
		
		public void loginTest(){
			
		homePage = lp.Login(prop.getProperty("Email"), prop.getProperty("Password"));
		
			
		}

	

	@AfterMethod

	public void tearDown() {

		driver.quit();

	}








}
