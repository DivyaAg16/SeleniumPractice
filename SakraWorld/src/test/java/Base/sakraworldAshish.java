package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class sakraworldAshish extends Base{
	@Test
	public void appointmentTest() throws InterruptedException{
		//launch browser
		launchDriver("Chrome");
		//go to url
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		//click on doctor's name
		driver.findElement(By.linkText(prop.getProperty("doc_name"))).click();
		//appointment form name
		//boolean result= isElementPresent(prop.getProperty("name"));
		//System.out.println(result);
		driver.findElement(By.xpath(prop.getProperty("name_xpath"))).sendKeys(prop.getProperty("name"));
		//appointment form email id
		driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys(prop.getProperty("email"));
		//mobile number
		driver.findElement(By.id(prop.getProperty("mobile_id"))).sendKeys(prop.getProperty("mobile_no"));
		//gender
		WebElement gender= driver.findElement(By.id(prop.getProperty("gender_id")));
		Select s= new Select(gender);
		s.selectByVisibleText("Male");
		//yes/No radio button
		
		/*boolean uhid= isElementPresent(prop.getProperty("uhid"));
		if(uhid==false) {
			driver.findElement(By.id(prop.getProperty("yes_radio_id"))).click();
			if(uhid==true) {
				driver.findElement(By.id(prop.getProperty("uhid"))).sendKeys(prop.getProperty("uhid_val"));
				driver.findElement(By.id(prop.getProperty("uhid"))).getAttribute("value");
			}
			else 
			{
				System.out.println("uhid field not present");
			}
		}
		else 
		{
			//driver.findElement(By.id(prop.getProperty("no_radio_id"))).click();
			//driver.findElement(By.id(prop.getProperty("yes_radio_id"))).click();
			driver.findElement(By.id(prop.getProperty("uhid"))).sendKeys(prop.getProperty("uhid_val"));
			driver.findElement(By.id(prop.getProperty("uhid"))).getAttribute("value");
		}*/
	

		
	
		
		/*	WebElement element= null;
			//presence
			try {
			element= driver.findElement(By.id(locator));
			}catch(Exception e){
				return false;
			}
			
			//visibility
			if(!element.isDisplayed())
				return false;
			
			return true;
		}*/
		
	}
	
}


