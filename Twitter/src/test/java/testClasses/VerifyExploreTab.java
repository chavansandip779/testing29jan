package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclasses.HomePage;
import pomclasses.LoginPage;

public class VerifyExploreTab{
     public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://twitter.com/i/flow/login");
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			LoginPage loginPage = new LoginPage(driver);
			
			loginPage.sendEmailid();
			loginPage.clickOnNextButton1();
			Thread.sleep(2000);
			loginPage.sendUserName();
			loginPage.clickOnNextButton2();
			Thread.sleep(2000);
			loginPage.sendPassword();
			loginPage.clickOnLoginButton();
			
			HomePage homePage= new HomePage(driver);
			Thread.sleep(2000);
			homePage.clickOnExplore();
			
			String url= driver.getCurrentUrl();
			String title = driver.getTitle();
			System.out.println(url);
			System.out.println(title);
			if(url.equals("https://twitter.com/explore")&&title.equals("Twitter"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			
}
}