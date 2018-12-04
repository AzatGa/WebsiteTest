package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JessicaEvaniaSusanto/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// go to Home Depot home page
		driver.get("https://www.wish.co/");
		Thread.sleep(4000);
		driver.get("https://www.wish.com/");
		Thread.sleep(3000);
		driver.quit();
	}

}
