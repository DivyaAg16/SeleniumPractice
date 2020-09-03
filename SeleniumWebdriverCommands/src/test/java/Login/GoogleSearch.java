package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class GoogleSearch extends TestBase{
	@Test
	public void google() {
		WebDriver driver= launchDriver("Firefox");
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Divya Tripathi");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//span[text()='Divyanka Tripathi']")).sendKeys(Keys.ENTER);
		
	}
}
