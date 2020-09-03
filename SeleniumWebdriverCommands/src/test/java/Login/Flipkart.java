package Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.TestBase;

public class Flipkart extends TestBase{
	@Test
	public void tshirtName() {
		WebDriver driver = launchDriver("Chrome");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button._2AkmmA._29YdH8")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/ul/li/ul/li[2]/ul/li[3]/a")).click();
	
		List<WebElement> tshirtNames= driver.findElements(By.cssSelector("a._2mylT6"));
		List<WebElement> tshirtPrices= driver.findElements(By.cssSelector("div[class='_1uv9Cb']>div[class='_1vC4OE']"));
		System.out.println(tshirtNames.size());
		for(int i=0;i<tshirtNames.size();i++) {
			System.out.println((i+1)+ ":TshirtName is: "+tshirtNames.get(i).getText()+"   TshirtName is: "+tshirtPrices.get(i).getText());
			
		}
	}
}
