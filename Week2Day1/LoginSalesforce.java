package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSalesforce {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		//create object to launch ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();

		//Find the webelement of Username textbox by id
		WebElement eleUsername = driver.findElement(By.id("username"));
		//To type the username in the username text box
		eleUsername.sendKeys("hari.radhakrishnan@qeagle.com");

		//Find the webelement of Password textbox by id
		WebElement elePassword = driver.findElement(By.id("password"));
		//To type the username in the username text box
		elePassword.sendKeys("Testleaf$321");

		//Find the webelement of Login button 
		WebElement eleLogin = driver.findElement(By.id("Login"));
		eleLogin.click();

	}

}