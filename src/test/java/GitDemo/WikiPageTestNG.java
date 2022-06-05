package GitDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WikiPageTestNG {

	public static WebDriver driver;
	@BeforeMethod
public void setup()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahim\\Dropbox\\My PC (DESKTOP-UA48023)\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver =new ChromeDriver();
    driver.get("https://www.wikipedia.org/");
    driver.manage().window().maximize();
    System.out.println("Before Methos will Execute ");
    System.out.println("Before Methos will Execute ");

    System.out.println("Before Methos will Execute ");

    System.out.println("Before Methos will Execute ");

    }
@Test(priority =1)
 public void wikipage()
 {
	 driver.findElement(By.xpath("//*[@type ='submit']")).click();
 }
@Test(priority =2)
public void mainPage()
{
	driver.navigate().to("https://en.wikipedia.org/wiki/Special:Search?search=&go=Go");
	driver.findElement(By.linkText("Main page")).click();
	
	
}
@AfterMethod
	public void closeBrowser ()
	{
		driver.close();
	}
}
