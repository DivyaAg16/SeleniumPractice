import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class LaunchBrowsers {
	
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "//Users//divya//Downloads//chromedriver");
		System.setProperty("webdriver.gecko.driver", "//Users//divya//Downloads//geckodriver");
		
		ChromeOptions ops1= new ChromeOptions();
		ops1.addArguments("--disable-notifications");
		
		FirefoxProfile prof = new FirefoxProfile();
		prof.setPreference("dom.webnotifications.enabled", false);
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		driver= new FirefoxDriver();
		driver.get("https://yahoo.com");
	}
}
