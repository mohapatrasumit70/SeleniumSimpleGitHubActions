package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import BaseClass.BasePage;

public class Register extends BasePage{
	@FindBy(xpath = "//a[text()='Register']")
	WebElement RigisterButtonLink;
	
	@FindBy(xpath = "//input[contains(@id,'gender-male')]")
	WebElement GenderRadioButton;
	
	
	@FindBy(xpath = "//input[contains(@name,'FirstName')]")
	WebElement First_Name;
	
	@FindBy(xpath = "//input[contains(@name,'LastName')]")
	WebElement Last_Name;
	
	@FindBy(xpath = "//input[contains(@id,'Email') and contains(@name,'Email')]")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='Password' and @name='Password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword' and @name='ConfirmPassword']")
	WebElement ConformPassword;
	
	@FindBy(xpath = "//input[@id='register-button' and @name='register-button']")
	WebElement RegisterSubmit;
	@FindAll({@FindBy(xpath = "//div[contains(text(),'Your registration completed')]"),@FindBy(xpath = "//div[@class='result']")})
	WebElement Confamation;
	
	
	public Register(WebDriver driver) {
		super(driver);
	}
	
	public void RigisterButtonClick()
	{
		click(RigisterButtonLink);
	} 
	public void ClickonGenderRadioButton()
	{
		click(GenderRadioButton);
	}
    public void FirstName(String FistName)
    {
    	clearAndType(First_Name, FistName);
    }
    public void LastName(String LastName)
    {
    	clearAndType(Last_Name, LastName);
    }
    
    public void Email(String email_id)
    {
    	clearAndType(email, email_id);
    }
    public void Password(String Fpassword)
    {
    	clearAndType(Password, Fpassword);
    }
    public void ConformPassword(String Cpassword)
    {
    	clearAndType(ConformPassword, Cpassword);
    }
    
    public void RegistarationSubmit()
    {
    	click(RegisterSubmit);
    }
    public String RegistationCompleteConformation()
    {
    	return getText(Confamation);
    }
}
