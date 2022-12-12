package Week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethods {

	public static void launchApplication() {
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

	}

}
