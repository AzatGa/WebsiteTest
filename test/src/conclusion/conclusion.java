package conclusion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conclusion {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JessicaEvaniaSusanto/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.wish.com/");
		// to create a new account with email that has been used to register
		driver.findElement(By.cssSelector("#signup-form > div.signup-btn-group > div.test-esb.btn.cronkite.main-color.main-color-border-color")).click();
		driver.findElement(By.cssSelector("#test-fn")).sendKeys("national");
		driver.findElement(By.cssSelector("#test-ln")).sendKeys("league");
		driver.findElement(By.cssSelector("#test-se")).sendKeys("leaguenational1@gmail.com");
		driver.findElement(By.cssSelector("#test-sp")).sendKeys("a");
		driver.findElement(By.cssSelector("#test-esf > button")).click();
		
		Thread.sleep(4000);
		driver.get("https://www.wish.com/");
		// to create a new account with email that has been used to register with same password as first registered
		driver.findElement(By.cssSelector("#signup-form > div.signup-btn-group > div.test-esb.btn.cronkite.main-color.main-color-border-color")).click();
		driver.findElement(By.cssSelector("#test-fn")).sendKeys("abcd");
		driver.findElement(By.cssSelector("#test-ln")).sendKeys("efgh");
		driver.findElement(By.cssSelector("#test-se")).sendKeys("leaguenational1@gmail.com");
		driver.findElement(By.cssSelector("#test-sp")).sendKeys("Ln12345678;");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#test-esf > button")).click();
	}
}
