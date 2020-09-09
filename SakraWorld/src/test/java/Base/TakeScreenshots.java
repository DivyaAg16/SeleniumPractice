package Base;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TakeScreenshots extends Base{
	
	
	@Test
	public void screenshot() {
		launchDriver("Chrome");
		driver.get("https://www.chabadpotomac.com/templates/articlecco_cdo/aid/1094542/jewish/HS-Registration-Form-New-Student.htm");
		
		takeScreenShot("//Users//divya//Documents//sample.jpg");
		WebElement e = driver.findElement(By.xpath("//*[@id='menu']"));
		
		getElementScreenshot(e, "//Users//divya//Documents//menu.jpg");
		
	}
	
	public void takeScreenShot(String filePath){
		// take screenshot- java object
		// save screenshot in path
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		// get the dynamic folder name
		FileUtils.copyFile(srcFile, new File(filePath));
		//test.addScreenCaptureFromPath("path of image", "xxxx");

		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

	}
	
	
	public void getElementScreenshot(WebElement  ele, String filePath)
    {
			// Get entire page screenshot
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			BufferedImage fullImg;
			try {
			fullImg = ImageIO.read(screenshot);
			// Get the location of element on the page , 100,150
			Point point = ele.getLocation();
			
			// Get width and height of the element  -50,100
			int eleWidth = ele.getSize().getWidth();
			int eleHeight = ele.getSize().getHeight();
			
			// Crop the entire page screenshot to get only element screenshot
			BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
			   eleWidth, eleHeight);
			ImageIO.write(eleScreenshot, "png", screenshot);
			
			// Copy the element screenshot to disk
			File screenshotLocation = new File(filePath);
			FileUtils.copyFile(screenshot, screenshotLocation);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			
			
       
    }

}
