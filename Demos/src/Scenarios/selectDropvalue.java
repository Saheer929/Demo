package Scenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class selectDropvalue {
	
	public WebDriver driver;
	
	@Test(enabled= true)
	public void links() throws AWTException
	{		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//jars//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver=new ChromeDriver();
		// Open facebook
		driver.get("http://toolsqa.com/automation-practice-form/");
		//Testing
		System.out.println("Testing");
		// Maximize browser
		driver.manage().window().maximize();
		
		//Select a value into a drop down box
/*		Select oSelect = new Select(driver.findElement(By.id("continents")));
		
		List<WebElement> lis = oSelect.getOptions();
		int totalvalues = lis.size();
		for(int i=0;i<totalvalues;i++ )
		{
			System.out.println(oSelect.getOptions().get(i).getText());
		}*/
//	    driver.quit();/
		
		driver.findElement(By.name("photo")).click();
		//driver.switchTo().activeElement().sendKeys("C:\\Saheer\\textfile.txt");
		StringSelection ss = new StringSelection("C:\\Saheer\\textfile.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease (KeyEvent.VK_V);
		robot.keyRelease (KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
	}
	
	
}
