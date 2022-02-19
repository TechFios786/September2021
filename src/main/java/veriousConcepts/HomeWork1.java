package veriousConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
	
	WebDriver driver;
	
	
	public void homeWork() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

}
}