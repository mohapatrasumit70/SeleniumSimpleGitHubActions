package TestExicute;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import BaseClass.BaseTest;
import Pages.Register;

public class RegisterUserExicuteMyEmail extends BaseTest {
	Register register;
	Faker facker = new Faker();
	String fackerFirstName = "sumit";
	String fackerLastName = "mohapatra";
	String Email = "sumitkumarmohapatra21@gmail.com";
	String Password = "sumit123";

	@Test
	public void RegisterUser() throws InterruptedException {
		register = new Register(driver);
		register.RigisterButtonClick();
		log.info("Click On Register Button");
		register.ClickonGenderRadioButton();
		log.info("Selected Radio Button");
		register.FirstName(fackerFirstName);
		log.info("First Name Is Fillup");
		register.LastName(fackerLastName);
		log.info("Last Name Is Fillup");
		register.Email(Email);
		log.info("Email Id  Is Fillup");
		register.Password(Password);
		log.info("Password Is Fillup");
		register.ConformPassword(Password);		
		log.info("Conform Password Is Fillup");
		register.RegistarationSubmit();
		Thread.sleep(2000);
		log.info(register.RegistationCompleteConformation());
		Assert.assertEquals(register.RegistationCompleteConformation(), "Your registration completed");
	}

}
