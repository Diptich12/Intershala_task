package myproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovid {

	public class dataprovider{
		@Test(dataProvider="logindata")
		public void testcase1(String username,String password) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new FireFoxDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.name("Username")).sendKeys("student");
			driver.findElement(By.name("Password")).sendKeys("Password123");
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		}
	}

}
