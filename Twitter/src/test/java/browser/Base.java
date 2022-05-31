package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;

public class Base {
	public static WebDriver openChromebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
	      WebDriver driver = new ChromeDriver();
	      return driver;
	}
   public static WebDriver openEdgebrowser()
    {
	System.setProperty("webdriver.edge.driver", "C:\\selenium\\edgedriver_win64\\msedgedriver.exe");
	
      WebDriver driver = new EdgeDriver();
      return driver;
}

}
