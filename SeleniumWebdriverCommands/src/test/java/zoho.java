import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class zoho extends TestBase{

	@Test
	
	public void Testzoho() throws InterruptedException {
		WebDriver driver = launchDriver("Chrome");
		driver.get("https://www.zoho.com/");
		driver.findElement(By.className("zh-signup")).click();
		driver.findElement(By.id("emailfield")).sendKeys("Hello");
		driver.findElement(By.id("password")).sendKeys("Hello");
		Thread.sleep(6000);
		//driver.findElement(By.className("sign_agree")).click();
		driver.findElement(By.xpath("//*[@id=\"signup-termservice\"]")).click();
		String text = driver.findElement(By.xpath("//*[@id=\"signup-termservice\"]")).getAttribute("value");
		System.out.println(text);
		text= driver.findElement(By.id("signupbtn")).getAttribute("value");
		System.out.println(text);
		text= driver.findElement(By.id("emailfield")).getAttribute("value");
		System.out.println(text);
	}
}
