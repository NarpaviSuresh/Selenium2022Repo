package Week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
//		1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
//		2. Enter UserName and Password Using Id Locator
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
//		 * 3. Click on Login Button using Class Locator
		 driver.findElement(By.className("decorativeSubmit")).click();
//		 * 4. Click on CRM/SFA Link
		 driver.findElement(By.linkText("CRM/SFA")).click();
//		 * 5. Click on contacts Button
		 driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
//		 * 6. Click on Create Contact
		 driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
//		 * 7. Enter FirstName Field Using id Locator
		 driver.findElement(By.id("firstNameField")).sendKeys("Suresh");
//		 * 8. Enter LastName Field Using id Locator
		 driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
//		 * 9. Enter FirstName(Local) Field Using id Locator
		 driver.findElement(By.name("firstNameLocal")).sendKeys("Suresh");
//		 * 10. Enter LastName(Local) Field Using id Locator
		 driver.findElement(By.name("lastNameLocal")).sendKeys("Kumar");
//		 * 11. Enter Department Field Using any Locator of Your Choice
		 driver.findElement(By.name("departmentName")).sendKeys("CS");
//		 * 12. Enter Description Field Using any Locator of your choice 
		 driver.findElement(By.name("description")).sendKeys("test"); 
//		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		 driver.findElement(By.name("primaryEmail")).sendKeys("test@123.com"); 
//		 * 14. Select State/Province as NewYork Using Visible Text
		 WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select stateDrpdwn = new Select(state);
		 stateDrpdwn.selectByVisibleText("New York");
//		 * 15. Click on Create Contact
		 driver.findElement(By.name("submitButton")).click();
//		 * 16. Click on edit button 
		 driver.findElement(By.linkText("Edit")).click();
//		 * 17. Clear the Description Field using .clear
		 driver.findElement(By.name("description")).clear();
//		 * 18. Fill ImportantNote Field with Any text
		 driver.findElement(By.name("importantNote")).sendKeys("Test");
//		 * 19. Click on update button using Xpath locator
		 driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//		 * 20. Get the Title of Resulting Page.
		 String title = driver.getTitle();
		 System.out.println("Title of the page :"+title);

	}

}
