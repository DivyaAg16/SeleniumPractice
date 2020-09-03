package Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.TestBase;

public class Cnn extends TestBase{
	@Test
	public void cnn() throws InterruptedException {
	WebDriver driver = launchDriver("Chrome");
	driver.get("https://edition.cnn.com/");
	//driver.findElement(By.cssSelector("svg.menu-icon")).click();
	//Thread.sleep(7000);
	//driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[2]/div/div[3]/nav/ul/li[3]/ul/li[1]/a")).click();
	//String text= driver.findElement(By.cssSelector(".Box-sc-1fet97o-0.jSTOdN nav >ul > li:nth-child(3) >ul> li:nth-child(1)")).getText();
	//System.out.println(text);
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	System.out.println(allLinks.size());
	for(int i= 0; i<allLinks.size(); i++) {
		WebElement link= allLinks.get(i);
		System.out.println(link.getText());
		System.out.println(link.isDisplayed());
	}
	}
}
