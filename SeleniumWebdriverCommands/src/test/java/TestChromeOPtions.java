import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestChromeOPtions {
	@Test
	public void testChrome() {
		System.setProperty("webdriver.chrome.driver", "//Users//divya//Downloads//chromedriver");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "logs\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("disable-notifications");
		ops.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}

}
