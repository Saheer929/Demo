package Scenarios;

import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class noofLinks {
	
	public WebDriver driver;
	
	@Test(enabled= true)
	public void links()
	{		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//jars//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver=new ChromeDriver();
		// Open facebook
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		// Maximize browser
		driver.manage().window().maximize();
		//******************FIND THE NO OF LINKS ON THE WEB PAGE********************************//
		List<WebElement> links = driver.findElements(By.tagName("a"));
	    int nooflinks = links.size(); 
	    System.out.println(nooflinks);
	    for (WebElement pagelink : links)
	         {
	          String linktext = pagelink.getText();
	          String link = pagelink.getAttribute("href"); 
	          System.out.println(linktext+" ->");
	          System.out.println(link);
	          }

		
//	    driver.quit();/

	}
	
	
}
