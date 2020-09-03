import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.TestBase;

public class CnnHeaders extends TestBase{
	@Test
	public void cnn() throws InterruptedException {
	WebDriver driver = launchDriver("Chrome");
	driver.get("https://edition.cnn.com/");
	List<WebElement> allLinks= driver.findElements(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li"));
	System.out.println("Total Links:" +allLinks.size());
	for(int i=0;i<allLinks.size();i++) {
	System.out.println(allLinks.get(i).getText());
	}
	}
}
