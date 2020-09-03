import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Browsers {
	
	@Test
	public void testApp() {
		System.setProperty("webdriver.chrome.driver", "//Users//divya//Downloads//chromedriver");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "logs\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		ChromeOptions ops= new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("--start-maximized");
		ops.addArguments("--ignore-certificate-errors");
		//ops.addArguments("--proxy-server=https://84.333.222.11"9090");
		ops.addArguments("user-data-dir=//Users//divya//Library//Application Support//Google//Chrome//Profile3");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
	}
}
