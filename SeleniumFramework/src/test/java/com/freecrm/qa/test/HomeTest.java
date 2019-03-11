package com.freecrm.qa.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.TestBase;

public class HomeTest extends TestBase{
	
	public HomeTest ht;
	
	public HomeTest() {
    super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
	
	
	ht = new HomeTest();
	
}
	
@Test

public void validateTitle() {
	String title =driver.getTitle();
	Assert.assertEquals(title, "shaili");
	
}

@Test
public void validatelogo() {
	boolean flag = 
			
}

LoginPage = ht.(prop.get)

	
}
}

