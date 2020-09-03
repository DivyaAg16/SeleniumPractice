package Login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class NullSkull extends TestBase{
	@Test
	public void nullSkull() {
		WebDriver driver = launchDriver("Firefox");
		driver.get("http://www.nullskull.com/articles/SumCaptchaTest.aspx");
	}

}
