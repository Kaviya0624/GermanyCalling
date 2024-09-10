package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver); 
	}
	
	
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Log In']")
	WebElement Login;
	
	@FindBy(xpath="//div[@class='alert alert-danger']//ul")
	WebElement alert;
	
	@FindBy(xpath="//a[@id='dropdownUser1']")
	WebElement dropdown;
	
	@FindBy(xpath="//span[normalize-space()='Logout']")
	WebElement Logout;
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	WebElement alert2;
	
	public void setUsername(String email)
	{
		username.sendKeys(email);
	}
	
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		Login.click();
	}
	
	public String showAlert()
	{
		return alert.getText();
	}
	
	public String showAlert2()
	{
		return alert2.getText();
	}
	      
	public void clickdropdown()
	{
		dropdown.click();
	}
	 
	
	public void clickLogout()
	{
		Logout.click();
	}

}
