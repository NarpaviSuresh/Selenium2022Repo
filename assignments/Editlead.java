package Week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

	public static void main(String[] args) throws InterruptedException {
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
//		* 6	Click Leads link
		 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
//		* 7	Click Find leads
		 driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
//		* 8	Enter first name
		 driver.findElement(By.id("ext-gen248")).sendKeys("Suresh");
//		* 9	Click Find leads button
		 driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
//		* 10 Click on first resulting lead
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
//		* 11 Verify title of the page
		 String title = driver.getTitle();
		 System.out.println("PageTitle:"+title);
//		* 12 Click Edit
		 driver.findElement(By.linkText("Edit")).click();
//		* 13 Change the company name
		 WebElement text1= driver.findElement(By.xpath("(//input[@class='inputBox'])[1]"));
		 String lastText = text1.getText();
		 System.out.println(lastText);
		 text1.clear();
		 text1.sendKeys("Testleaf");
//		* 14 Click Update
		 driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		 
//		* 15 Confirm the changed name appears
		 WebElement text2= driver.findElement(By.xpath("(//span[@class = 'tabletext'])[3]"));
		 String currentText = text2.getText();
		 if(lastText.equals(currentText)) {
			 System.out.println("CompanyName is not changed");
		 }
		 else {
			 System.out.println("CompanyName is changed");
		 }
//		* 16 Close the browser (Do not log out)
			 driver.close();
	}

}
