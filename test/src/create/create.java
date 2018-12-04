package create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class create {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JessicaEvaniaSusanto/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.wish.com/");
		// to create a new account with blank first name
		driver.findElement(By.cssSelector("#signup-form > div.signup-btn-group > div.test-esb.btn.cronkite.main-color.main-color-border-color")).click();
		driver.findElement(By.cssSelector("#test-fn")).sendKeys("");
		driver.findElement(By.cssSelector("#test-ln")).sendKeys("league");
		driver.findElement(By.cssSelector("#test-se")).sendKeys("leaguenational1@gmail.com");
		driver.findElement(By.cssSelector("#test-sp")).sendKeys("Ln12345678;");
		driver.findElement(By.cssSelector("#test-esf > button")).click();
		
		Thread.sleep(4000);
		driver.get("https://www.wish.com/");
		// to create a new account with blank email
		driver.findElement(By.cssSelector("#signup-form > div.signup-btn-group > div.test-esb.btn.cronkite.main-color.main-color-border-color")).click();
		driver.findElement(By.cssSelector("#test-fn")).sendKeys("national");
		driver.findElement(By.cssSelector("#test-ln")).sendKeys("league");
		driver.findElement(By.cssSelector("#test-se")).sendKeys("");
		driver.findElement(By.cssSelector("#test-sp")).sendKeys("Ln12345678;");
		driver.findElement(By.cssSelector("#test-esf > button")).click();
		
		Thread.sleep(4000);
		driver.get("https://www.wish.com/");
		// to create a new account with invalid email
		driver.findElement(By.cssSelector("#signup-form > div.signup-btn-group > div.test-esb.btn.cronkite.main-color.main-color-border-color")).click();
		driver.findElement(By.cssSelector("#test-fn")).sendKeys("national");
		driver.findElement(By.cssSelector("#test-ln")).sendKeys("league");
		driver.findElement(By.cssSelector("#test-se")).sendKeys("leaguenational1@gmail");
		driver.findElement(By.cssSelector("#test-sp")).sendKeys("Ln12345678;");
		driver.findElement(By.cssSelector("#test-esf > button")).click();
		
		Thread.sleep(6000);
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
		// to create a new account with valid information
		driver.findElement(By.cssSelector("#signup-form > div.signup-btn-group > div.test-esb.btn.cronkite.main-color.main-color-border-color")).click();
		driver.findElement(By.cssSelector("#test-fn")).sendKeys("national");
		driver.findElement(By.cssSelector("#test-ln")).sendKeys("league");
		driver.findElement(By.cssSelector("#test-se")).sendKeys("leaguenational1@gmail.com");
		driver.findElement(By.cssSelector("#test-sp")).sendKeys("Ln12345678;");
		driver.findElement(By.cssSelector("#test-esf > button")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
