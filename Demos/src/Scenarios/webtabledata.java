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


public class webtabledata {
	
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
		
		//******************READ WEB TABLT CONTENT********************************//
	/*	String val =driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]/a")).getText();
		System.out.println(val);*/
		
//		driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
		
		String sRow ="1";
		String sCol="1";
				
//		String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + sRow + "]/td[" + sCol + "]")).getText();
//		System.out.println(sCellValue);
		String sRowValue = "Clock Tower Hotel";
		
		for(int i=1;i<=5;i++){
			String sval= null;
			sval = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+ i +"]/th")).getText();
			//System.out.println(sval);
			if(sval.equalsIgnoreCase(sRowValue)){
				for(int j=1;j<=5;j++){
					String sColumnValue= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
					System.out.println(sColumnValue);
				}
			}
		}
		
		
		
		
		
//	    driver.quit();/

	}
	
	
}
