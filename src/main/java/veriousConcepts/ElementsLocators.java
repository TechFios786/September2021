package veriousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsLocators {
	WebDriver driver;
	@Before
	public void launchbrowser() {
		//create an Object and Set Property
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		//now we set the URL
		driver.get("http://objectspy.space/");
		//maximize
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
		//define wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Test
	public void learnElementLocator() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("Karim");
		driver.findElement(By.name("lastname")).sendKeys("Dool");
		//file Upload
		driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\abhad\\Downloads\\Selenium");
		//link Text
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		Thread.sleep(5000);
		//to navigate back to the codes
		driver.navigate().back();
		//Partial Link Text: you can copy an portion of your text not all of it
		driver.findElement(By.partialLinkText("TF-API")).click();
		//to use partial we should use the unique portion of the text
		//driver.findElement(By.partialLinkText(" Product")).click(); // this is not going to work, it matches L# 35
		//CSS selector
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.cssSelector("input#sex-0")).click();
		driver.findElement(By.cssSelector("input[value='3']")).click();
		driver.findElement(By.cssSelector("input[type='radio'][id='exp-4']")).click();
		
		//Xpath//Absolute
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Last Name");
		//Xpath //Relative
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Fahim");
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver' and @name = 'tool']")).click();
		driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click(); //same as l#55
		driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : New Page')]")).click(); //same as line#54
		
	}
	
	
}
