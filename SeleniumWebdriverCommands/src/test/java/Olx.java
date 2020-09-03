import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class Olx extends TestBase{
	
	@Test
	public void olxDropdown() throws InterruptedException {
		WebDriver driver = launchDriver("Chrome");
		driver.get("https://www.olx.in/");
		driver.findElement(By.xpath("//div[@data-aut-id='locationBox']")).click();
		driver.findElement(By.xpath("//span[text()='Kerala']")).click();
		//Thread.sleep(10000);
		String text= driver.findElement(By.xpath("//input[@placeholder='Search city, area or locality']")).getAttribute("value");
		System.out.println("State name is :"+text);
		//driver.findElement(By.cssSelector(".gs1FE>div:nth-child(2)>div:nth-child(2)")).click();
		//String state= stateName("Kerala");
		//System.out.println(state);
		
		driver.quit();
		
	}
	
}

