package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	

    //Constructor for initializing the Webdriver instance in the BasePage
	public HomePage(WebDriver driver)
	{
		super(driver);   // Calling the constructor of BasePage
	}
	
	@FindBy(xpath="//a[normalize-space()='Login / SignUp']")
	WebElement Login;
	
	@FindBy(xpath="//button[normalize-space()='Accept']")
	WebElement Cookies;
	
	public void clickLogin()
	{
		Login.click();
	}
	
	public void clickCookies()
	
	{
		 try {
	            
	            if (Cookies.isDisplayed())
	            {
	                Cookies.click();
	                
	                System.out.println("Cookies popup clicked.");
	            }
	            else 
	            {
	                System.out.println("Cookies popup not displayed.");
	            }
	            
	            
	        } catch (Exception e) 
		 		
		 		{
	           
	            System.out.println("Cookies popup not present" + e.getMessage());
	            
		 		}
		
	}
	
	

}
