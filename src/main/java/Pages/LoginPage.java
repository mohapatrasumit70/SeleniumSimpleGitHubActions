package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import BaseClass.BasePage;

public class LoginPage extends BasePage{
	@FindBy(xpath = "//a[text()='Log in']")
	WebElement loginlink;
	
	@FindBy(xpath = "//input[@id='Email' and @name='Email']")
    WebElement loginEmail;
	
	@FindBy(xpath = "//input[@id='Password' and @name='Password']")
    WebElement loginPassword;
	
	
	@FindBy(xpath = "//input[@id='RememberMe' and @name='RememberMe']")
    WebElement RemeberMe;
	
	
	
	@FindBy(xpath = "//input[@type='submit' and @value='Log in']")
    WebElement LoginSubmitButton;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void LoginbuttonEntry()
	{
		click(loginlink);
	}
	public void LoginEmail(String email)
	{
		type(loginEmail, email);
	}
	public void LoginPassword(String password)
	{
		type(loginPassword, password);
	}
	public void RememberMe()
	{
		click(RemeberMe);
	}
	
	public void LoginSubmitButton()
	{
		click(LoginSubmitButton);
	}
}
