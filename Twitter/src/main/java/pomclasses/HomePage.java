package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

     @FindBy (xpath ="(//a[@role='link'])[3]")private WebElement home;
	
	@FindBy (xpath ="//a[@aria-label='Search and explore']")private WebElement explore;
	
	@FindBy (xpath ="//a[@href='/notifications']")private WebElement nitification;
	
	@FindBy (xpath ="//div[@aria-label='More menu items']")private WebElement more;
	
	@FindBy (xpath ="//a[@href='/i/bookmarks']")private WebElement bookmark;
	
	@FindBy (xpath ="(//div[@class='css-1dbjc4n r-18u37iz r-16y2uox r-ymttw5 r-1yzf0co'])[2]")private WebElement moment ; 
	
	@FindBy (xpath ="//div[@aria-label='Account menu']")private WebElement account;
	
	@FindBy (xpath ="//a[@href='/logout']")private WebElement logout;
	
	@FindBy (xpath="(//div[@role='button'])[1]")private WebElement confirmLogOut ;
	
	@FindBy (xpath ="(//div[@role='button'])[2]")private WebElement logoutYes;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHome() 
	{
		home.click();
	}
	public void clickOnExplore() 
	{
		explore.click();
	}
	public void clickOnMessage() 
	{
		more.click();
	}
	public void clickOnNotification() 
	{
		nitification.click();
	}
	public void clickOnBookmark() 
	{
		bookmark.click();
	}
	public void clickOnmore()
	{
		more.click();
	}
	public void clickOnMoment()
	{
		moment.click();
	}
	public void clickOnAccount()
	{
		account.click();
	}
	public void applicationLogOut()
	{
		account.click();
		logout.click();
		confirmLogOut.click();
		//logoutYes.click();
	}
	
	
	
	
	
	
	
	
	
}
