package Week2.assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCreateNewAccount {

	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
//		Step 1: Download and set the path 
		// Step 2: Launch the Chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
	
		// Step 4: Maximize the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Suresh");
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		// Step 10: Enterthe password
		driver.findElement(By.id("password_step_input")).sendKeys("test123");
		// Step 11: Handle all the three drop downs
		WebElement dateDay = driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg']"));
		Select day = new Select(dateDay);
		day.selectByValue("30");
		
		WebElement dateMonth = driver.findElement(By.id("month"));
		Select month = new Select(dateMonth);
		month.selectByVisibleText("May");
		
		WebElement dateYear = driver.findElement(By.id("year"));
		Select year = new Select(dateYear);
		year.selectByValue("1988");
		
		// Step 12: Select the radio button "Female" 
		
		java.util.List<WebElement> list = driver.findElements(By.xpath("//input[@type='radio']"));
		list.get(0).click();
//		            ( A normal click will do for this step) 


	}

}
