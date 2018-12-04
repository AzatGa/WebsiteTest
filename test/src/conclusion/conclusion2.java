package conclusion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conclusion2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JessicaEvaniaSusanto/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.wish.com/");
		// to log in with invalid email with incorrect password
		driver.findElement(By.cssSelector("#signup-form > div.test-elb.btn.main-color-background")).click();
		driver.findElement(By.cssSelector("#test-le")).sendKeys("leaguenational1");
		driver.findElement(By.cssSelector("#test-lp")).sendKeys("abcd");
		driver.findElement(By.cssSelector("#test-elf > button")).click();
		
		Thread.sleep(4000);
		driver.get("https://www.wish.com/");
		// to log in with invalid email with incorrect password
		driver.findElement(By.cssSelector("#signup-form > div.test-elb.btn.main-color-background")).click();
		driver.findElement(By.cssSelector("#test-le")).sendKeys("leaguenational1@gmail");
		driver.findElement(By.cssSelector("#test-lp")).sendKeys("abcd");
		driver.findElement(By.cssSelector("#test-elf > button")).click();
	}
}