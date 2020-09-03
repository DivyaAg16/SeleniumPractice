package Login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class LoginTest extends TestBase{
	@Test
	public void login() {
		WebDriver driver = launchDriver("Firefox");
		driver.get("https://yahoo.com");
		
	}
	

}
