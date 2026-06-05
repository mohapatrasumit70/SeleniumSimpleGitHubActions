package TestExicute;

import org.testng.annotations.Test;

import BaseClass.BaseTest;
import Pages.LoginPage;
import utils.LoginDataProvider;

public class LoginValidation extends BaseTest {
	LoginPage login;
	 @Test(dataProvider = "loginData",
	          dataProviderClass = LoginDataProvider.class)
	    public void verifyLogin(String email,
	                            String password,
	                            String expectedResult) {
		 
		 login = new LoginPage(driver);
			login.LoginbuttonEntry();
			log.info("Click On Login Button");
			login.LoginEmail(email);
			login.LoginPassword(password);
			login.RememberMe();
			login.LoginSubmitButton();
			log.info("Click On Login Submit Button");

		

	        

//	        Assert.assertEquals(actualResult, expectedResult);
	    }

}
