package TestExicute;

import org.testng.annotations.Test;

import BaseClass.BaseTest;
import Pages.LoginPage;

public class LoginExicute extends BaseTest{
	LoginPage login;
	
	@Test
	public void TestExi() throws InterruptedException
	{
		login = new LoginPage(driver);
		login.LoginbuttonEntry();
		log.info("Click On Login Button");
		login.LoginEmail("Sumitkumarmohapatra21@gmail.com");
		login.LoginPassword("sumit123");
		login.RememberMe();
		login.LoginSubmitButton();
		log.info("Click On Login Submit Button");
		
		Thread.sleep(5000);
	}

}
