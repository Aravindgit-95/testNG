package orgg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BulkData {
	static WebDriver driver;

	@Test(dataProvider="data1")
	public void testcase1(String s1,String s2,String s3,String s4) {
		System.setProperty("webdriver.chrome.driver","I:\\Aravinsami\\sami codes\\TestNg\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		WebElement q = driver.findElement(By.id("email"));
		q.sendKeys(s1);
		
		WebElement q1 = driver.findElement(By.id("pass"));
		q1.sendKeys(s2);
		
		WebElement q4 = driver.findElement(By.name("firstname"));
		q4.sendKeys(s3);
		
		WebElement q5 = driver.findElement(By.name("lastname"));
		q5.sendKeys(s4);
		
		WebElement q3 = driver.findElement(By.id("loginbutton"));
		q3.click();
		
	}
	
	@DataProvider(name="data1")
	public Object[][] data(){
		return new Object[][] {
			{"aravind","swaami","arul","murugan"},
			{"gopinath","ashok","gowtham","deep"}
		
		
	};
}
}
