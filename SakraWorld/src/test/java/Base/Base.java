package Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Base {
	
	WebDriver driver;
	Properties prop = new Properties();
	public WebDriver launchDriver(String browserName) {
		if(browserName.equals("Firefox")) {
			FirefoxOptions options  = new FirefoxOptions();
			FirefoxProfile prof = new FirefoxProfile();
			prof.setPreference("dom.webnotifications.enabled", false);
			System.setProperty("webdriver.gecko.driver", "//Users//divya//Downloads//geckodriver");
			options.setProfile(prof);
			driver= new FirefoxDriver(options);
		}else if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "//Users//divya//Downloads//chromedriver");
			ChromeOptions ops1= new ChromeOptions();
			ops1.addArguments("--disable-notifications");
			ops1.addArguments("--start-maximized");
			driver= new ChromeDriver(ops1);
			driver.manage().window().maximize();
		}else if(browserName.equals("Edge")) {
			driver= new EdgeDriver();
			
		}
		
		try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//sakra.properties");
			prop.load(fs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}
	
}
