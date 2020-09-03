import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class GeckoDriver {
	
	@Test
	public void openFirefox() {
		
		System.setProperty("webdriver.gecko.driver", "//Users//divya//Downloads//geckodriver");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "logs\\firefox.log");
		FirefoxOptions options= new FirefoxOptions();
		FirefoxProfile prof = new FirefoxProfile();
		//set binary
		//options.setBinary("//Users//divya//Downloads//geckodriver")
		//notifications
		prof.setPreference("dom.webnotifications.enabled", true);
		//ssl
		prof.setAcceptUntrustedCertificates(true);
		prof.setAssumeUntrustedCertificateIssuer(false);
		//proxy
		//prof.setPreference("network.proxy.type", 1);
		//prof.setPreference("network.proxy.socks", "83.222.333.21");
		//prof.setPreference("network.proxy.socks_port", 1258);
		WebDriver fd= new FirefoxDriver(options);
		//fd.get("https://www.letskodeit.com");	
		//fd.get("http://pushengage.com/demo");
		//fd.get("https://naukri.com");(Pop up)
		//fd.get("https://facebook.com");
		fd.get("https://expired.badssl.com");
	}
}
