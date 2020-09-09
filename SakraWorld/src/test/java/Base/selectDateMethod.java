package Base;

//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class selectDateMethod {
	// public static void main(String args[])throws InterruptedException {
	public ChromeDriver drv;

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//divya//Downloads//chromedriver");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("https://www.sakraworldhospital.com/request-appointment.php");
		Thread.sleep(3000);
		drv.findElement(By.cssSelector("div.grid.hidden-xs > div:nth-child(2) > a")).click();
		WebDriverWait wait = new WebDriverWait(drv, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id=\"req_name\"]")));

		dateSelect("16-06-2019");
	}

	public void dateSelect(String selectDob) {
		drv.findElement(By.id("req_datebirth")).click();
		String currentDateMonth = drv.findElement(By.className("ui-datepicker-title")).getText().toString();
		System.out.println("currentDateMonth: " + currentDateMonth);
		String currentMonthYear = "September 2020";
		System.out.println("currentDateMonth: " + currentMonthYear);
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-YYYY");
		try {
			// String testDate= "16-06-2019";
			Date dateToBeSelected = sd.parse(selectDob);
			System.out.println("selectDob: " + selectDob);
			Date currentDate = new Date();
			System.out.println("currentDate is: " + currentDate);
			String day = new SimpleDateFormat("d").format(dateToBeSelected);
			System.out.println("Day is: " + day);
			String month = new SimpleDateFormat("MMMM").format(dateToBeSelected);
			System.out.println("Month is: " + month);
			String year = new SimpleDateFormat("YYYY").format(dateToBeSelected);
			System.out.println("Year is: " + year);
			String monthYearToBeSelected = month + " " + year;
			System.out.println("monthYearToBeSelected: " + monthYearToBeSelected);

			while (!monthYearToBeSelected.equals(currentMonthYear)) {
				// click on forward or back icon
				if (dateToBeSelected.compareTo(currentDate) == 1) {//
					// forward icon
					drv.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
				} else if (dateToBeSelected.compareTo(currentDate) == -1) {
					// back icon
					drv.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
				}
				currentMonthYear = drv.findElement(By.className("ui-datepicker-title")).getText();
				System.out.println("monthYearDisplayed -" + currentMonthYear);

			}

			// day
			drv.findElement(By.xpath("//a[text()='" + day + "']")).click();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
