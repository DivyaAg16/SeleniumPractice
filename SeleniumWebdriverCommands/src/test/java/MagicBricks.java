import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class MagicBricks extends TestBase{
	@Test
	public void magicBrick() {
		WebDriver driver = launchDriver("Chrome");
		driver.get("http://www.magicbricks.com");
		driver.findElement(By.id("rentDrop")).click();
		driver.findElement(By.cssSelector("#staticSwiperSliderRent > div:nth-child(1) > ul > li:nth-child(1) > span > span")).click();
		//driver.findElement(By.xpath("//*[@id=\"staticSwiperSliderRent\"]/div[2]/ul/li[1]/span/span")).click();
	}

}
