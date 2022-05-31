package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver ; 
  WebDriverWait wait ;
  
    @FindBy (xpath ="//input[@autocomplete='username']")private WebElement emailid;
	
	@FindBy (xpath ="(//div[@role='button'])[3]")private WebElement next1;
	
	@FindBy (xpath ="//input[@type='text']")private WebElement username;
	
	@FindBy (xpath ="(//div[@role='button'])[2]")private WebElement next2;
	
	@FindBy (xpath ="//input[@name='password']")private WebElement password;
	
	@FindBy (xpath ="(//div[@role='button'])[3]")private WebElement login;
	
	@FindBy (xpath ="//a[@href='/login']")private WebElement signin;
	
	@FindBy (xpath ="//input[@type='text']")private WebElement appleid;
	
	@FindBy (xpath ="//button[@id='sign-in']")private WebElement next;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void sendEmailid()
	{
		emailid.sendKeys("chavansandip779@gmail.com");
	}
	public void clickOnNextButton1()
	{
		next1.click();
	}
	public void sendUserName()
	{  
		username.sendKeys("chavansandip779");
	}
	public void clickOnNextButton2()
	{
		next2.click();
	}
	public void sendPassword()
	{ 
		password.sendKeys("Ramchandra@7378");
	}
	public void clickOnLoginButton() 
	{
		login.click();
	}
	public void signIn()
	{
	      signin.click();
	}
	public void sendToAppleId()
	{
		appleid.sendKeys("chavansandip779@gmail.com");
	}
	
	public void clickOnNext()
	{
		next.click();
	}
	
	
	//OR
//	public void loginToApplication()
//	{
//		emailid.sendKeys("chavansandip779@gmail.com");
//		next1.click();
//		username.sendKeys("chavansandip779");
//		next2.click();
//		password.sendKeys("Ramchandra@7378");
//		login.click();
//		
		
	
	
	
}
