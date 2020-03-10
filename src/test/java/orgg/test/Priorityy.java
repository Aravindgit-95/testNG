package orgg.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Priorityy {
 static	WebDriver driver;
	
	@BeforeClass 
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "I:\\Aravinsami\\sami codes\\TestNg\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
	
	@BeforeMethod
	public void before() {
		driver.get("https://www.facebook.com/");
		Date d= new Date();
		System.out.println("Start time: "+d);
		
	}
	
	@AfterMethod
	public void After() {
		Date d= new Date();
		System.out.println("End time: "+d);
		
	}
	
	@Test(priority=-2)
	public void testCase1() {
		String url = driver.getCurrentUrl();
		
		WebElement f1 = driver.findElement(By.id("email"));
		f1.sendKeys("aravindswaami@gmail.com");
		String txt = f1.getAttribute("value");
		Assert.assertEquals(txt,"aravindswaami@gmail.com");
		
		WebElement f2 = driver.findElement(By.id("pass"));
		f2.sendKeys("12345");
		String att = f2.getAttribute("value");
		Assert.assertTrue(att.contains("12"));
		WebElement f3 = driver.findElement(By.id("loginbutton"));
		f3.click();
		
	}
	
	@Test(priority=-9,invocationCount=5)
	
	public void testCase2() {
		WebElement f1 = driver.findElement(By.id("email"));
		f1.sendKeys("aravind2279500@gmail.com");
		
		WebElement f2 = driver.findElement(By.id("pass"));
		f2.sendKeys("ertyuio");
		WebElement f3 = driver.findElement(By.id("loginbutton"));
		f3.click();
	}
	
	@Test
	
	public void testCase3() {
		WebElement f1 = driver.findElement(By.id("email"));
		f1.sendKeys("ertyuijhgf@gmail.com");
		
		
		WebElement f2 = driver.findElement(By.id("pass"));
		f2.sendKeys("12345dfghj");
		WebElement f3 = driver.findElement(By.id("loginbutton"));
		f3.click();
	}

}
