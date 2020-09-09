package Base;

//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SakraWorld extends Base {
	@Test//
	public void sakraTest() throws InterruptedException {
		WebDriver driver = launchDriver("Chrome");
		driver.get(prop.getProperty("url"));
		Thread.sleep(5000);
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3000));
		driver.findElement(By.cssSelector(prop.getProperty("Doc_locator_css"))).click();
		// wait.until(ExpectedConditions.visibilityOfAllElement(prop.getProperty("name_xpath"));
		String nameText = driver.findElement(By.xpath(prop.getProperty("name_xpath"))).getAttribute("placeholder");
		System.out.println(nameText);
		driver.findElement(By.xpath(prop.getProperty("name_xpath"))).sendKeys("Test");
		driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys("test@gmail.com");
		driver.findElement(By.id(prop.getProperty("mobile_id"))).sendKeys("9876543210");
		Boolean text = driver.findElement(By.xpath(prop.getProperty("name_xpath"))).isDisplayed();
		System.out.println("Name Field displayed: " + text);
		text = driver.findElement(By.xpath(prop.getProperty("name_xpath"))).isEnabled();
		System.out.println("Name Field Enabled: " + text);
		text = driver.findElement(By.xpath(prop.getProperty("text_msg_xpath"))).isDisplayed();
		System.out.println("Text displayed: " + text);
		String pageText = driver.findElement(By.xpath(prop.getProperty("text_msg_xpath"))).getText();
		String preferredTime = "Preferred Date and Time is subject tochange. Our support team will be in contact with you, within 24 hours.";
		if (pageText.equals(preferredTime))
			System.out.println("Preferred Date and Time is subject tochange!");
		else
			System.out.println("Text is not present!");
		// gender
		WebElement gender = driver.findElement(By.id(prop.getProperty("gender_id")));
		Select s = new Select(gender);
		s.selectByVisibleText("Female");
		List<WebElement> genderOptions = driver.findElements(By.xpath(prop.getProperty("gender_options")));
		System.out.println(genderOptions.size());

		// DOB

	}

	public void selectDate() {
		driver.findElement(By.xpath(prop.getProperty("DOB_xpath"))).click();

	}

}
