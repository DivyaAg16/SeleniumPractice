import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class WhizdomDropdown extends TestBase{
	@Test
	public void dropdown() throws InterruptedException {
		WebDriver driver = launchDriver("Chrome");
		driver.get("https://www.qtpselenium.com/contact-us");
		
		driver.findElement(By.name("country_id")).click();
		
	}
}
