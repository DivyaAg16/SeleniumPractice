import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSerachAjax{

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//divya//Downloads//chromedriver");
		ChromeOptions ops1= new ChromeOptions();
		ops1.addArguments("--disable-notifications");
		ops1.addArguments("--start-maximized");
		ChromeDriver driver= new ChromeDriver(ops1);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String search= ajaxSearch();
		driver.findElement(By.name("q")).sendKeys(search);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		/*String text= driver.findElement(By.xpath("//span[text()='Hello World']")).getText();
		if (text.equals(search)) {
			//driver.findElement(By.xpath("//span[text()='Hello World']")).click();
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		}*/
	}
	
	public static String ajaxSearch() {
		String option= "Hello India";
		return option;
	}

}
