package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class Facebook extends TestBase{
	@Test
	public void facebookFriend() {
	WebDriver driver = launchDriver("Chrome");
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("16divya.agarwal@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("subex8890!");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.xpath("//div[@class='buofh1pr']/ul")).click();
	driver.findElement(By.xpath("//a[text()='Friends']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Neha");
	}
}
