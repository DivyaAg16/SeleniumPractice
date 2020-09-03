package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class Americangolf extends TestBase{
	@Test
	public void americanGolf() {
		WebDriver driver = launchDriver("Firefox");
		driver.get("https://www.americangolf.co.uk/");
		driver.findElement(By.xpath("//div[@id='header-navigation']/div[2]/div[4]")).click();
		String cartText= driver.findElement(By.xpath("//div[@id='cart']")).getText();
		System.out.println(cartText);
	}

}
