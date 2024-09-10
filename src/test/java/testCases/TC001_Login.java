package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC001_Login extends BaseClass{
	
		@Test(priority=1)
	    public void testSuccessfulLogin() throws InterruptedException
	    {
			logger.info("Test execution started....");;
			try {
				
			// Initialize HomePage object
			HomePage hp = new HomePage(driver);
			hp.clickCookies();  // Click on cookies popup if present
			hp.clickLogin();
			
			Thread.sleep(3000);
			
			logger.info("clicked login page....");
			
			 //Initialize LoginPage object and perform login actions
			LoginPage lp = new LoginPage(driver);
			lp.setUsername(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();
			
			Thread.sleep(2000);
			
			//Verify if the login was successful by checking the URL
			Assert.assertEquals(driver.getCurrentUrl(), "https://app.germanyiscalling.com/cv/upload/?utm_source=website&utm_medium=website&utm_campaign=navbar_menu", "Login was not successful - User is not on the expected page.");
			
			lp.clickdropdown();
			lp.clickLogout();
			}
			 catch (Exception e) 
			{
		           
		            Assert.fail("Test Failed due to exception: " + e.getMessage());
		    }
			
			logger.info("Test execution ended....");
	    }
		
		
		
		@Test(priority=2)
	    public void InvalidPassword() throws InterruptedException
	    {
			logger.info("Test execution started....");
			try {
			LoginPage lp = new LoginPage(driver);
			lp.setUsername(p.getProperty("email"));
			lp.setPassword("kavi");
			lp.clickLogin();
			
			//Capture and verify the alert message for incorrect password
			String actualAlertMessage = lp.showAlert();
			String expectedAlertMessage = "Please enter a correct username and password. Note that both fields may be case-sensitive."; 
			    
			Thread.sleep(2000);
			
			//to validate that the error message matches the expected result
			Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Error message is not as expected.");
			}
			 catch (Exception e)
			{
		            
		            Assert.fail("Test Failed due to exception: " + e.getMessage());
		    }
			logger.info("Test execution ended....");
			
	    }
		
		@Test(priority=3)
	    public void InvalidEmail() throws InterruptedException
	    {
			logger.info("Test execution started....");
			
			try
			{
			
			LoginPage lp = new LoginPage(driver);
			lp.setUsername("kaviya@gmail.com");
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();
			
			String actualAlertMessage = lp.showAlert(); 
			String expectedAlertMessage = "Please enter a correct username and password. Note that both fields may be case-sensitive."; 
			    
			Thread.sleep(2000);
			
			Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Error message is not as expected.");
			}
			 catch (Exception e) 
			{
		            Assert.fail("Test Failed due to exception: " + e.getMessage());
		    }
			logger.info("Test execution ended....");
			
	    }
		
		@Test(priority=4)
	    public void Blankfield() throws InterruptedException
	    {
			logger.info("Test execution started....");
			
			try
			{
			LoginPage lp = new LoginPage(driver);
			lp.setUsername("");
			lp.setPassword("");
			lp.clickLogin();
			
			String actualAlertMessage = lp.showAlert2(); 
			String expectedAlertMessage = "Email: This field is required.\nPassword: This field is required."; 
			    
			Thread.sleep(2000);
			
			Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Error message is not as expected.");
			}
			catch (Exception e) 
			{
		            Assert.fail("Test Failed due to exception: " + e.getMessage());
		    }
			
			logger.info("Test execution ended....");
	    }
		
		@Test(priority=5)
	    public void Specialchar() throws InterruptedException
	    {
			logger.info("Test execution started....");
			
			try
			{
			LoginPage lp = new LoginPage(driver);
			lp.setUsername("@#$%%");
			lp.setPassword("##$3");
			lp.clickLogin();
			
			String actualAlertMessage = lp.showAlert(); 
			String expectedAlertMessage = "Please enter a correct username and password. Note that both fields may be case-sensitive."; 
			    
			Thread.sleep(2000);
			
			Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Error message is not as expected.");
			}
			catch (Exception e) 
			{
		            Assert.fail("Test Failed due to exception: " + e.getMessage());
		    }
			
			logger.info("Test execution ended....");
			
	    }

}
