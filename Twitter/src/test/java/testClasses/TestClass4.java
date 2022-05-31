package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Base;
import pomclasses.HomePage;
import pomclasses.LoginPage;

public class TestClass4 {

	
		WebDriver driver ;
		HomePage homePage ;
		LoginPage loginPage ;
		@Parameters("browserName")
		@BeforeTest
		public void launchBrawser(String browser)
		{
			System.out.println(browser);
			
			if(browser.equals("chrome"))
			{
				driver=Base.openChromebrowser();
			}
			if(browser.equals("edge"))
			{
				driver=Base.openEdgebrowser();
			}
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		@BeforeClass
		public void launchBrowser()
		{
	    	loginPage = new LoginPage(driver);
	    	 homePage = new HomePage(driver);
		}
		@BeforeMethod
		public void launchApplication() throws InterruptedException
		{
	      driver.get("https://twitter.com/");
			
			driver.manage().window().maximize();
			
			loginPage.signIn();
			loginPage.sendEmailid();
			loginPage.clickOnNextButton1();
			 loginPage.sendUserName();
		     loginPage.clickOnNextButton2();
			 loginPage.sendPassword();
			loginPage.clickOnLoginButton();
		   
		}
		
		@Test
		public void TestB() throws InterruptedException
		{
			
			homePage.clickOnExplore();
			
			String url= driver.getCurrentUrl();
			String title = driver.getTitle();
			System.out.println(url);
			System.out.println(title);
			
			Assert.assertEquals("https://twitter.com/explore", url);
			Assert.assertEquals("Twitter", title);
		}
		@AfterMethod
		public void logoutFromApplication() throws InterruptedException
		{
			homePage.applicationLogOut();
			
		}
		@AfterClass
		public void clearObject()
		{
			loginPage=null;
			homePage=null;
		}
		@AfterTest
		public void closeBrowser()
		{
			driver.close();
			driver=null;
			System.gc();
		}
		
}
