package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JessicaEvaniaSusanto/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.wish.com/");
		// to log in with blank email
		driver.findElement(By.cssSelector("#signup-form > div.test-elb.btn.main-color-background")).click();
		driver.findElement(By.cssSelector("#test-le")).sendKeys("");
		driver.findElement(By.cssSelector("#test-lp")).sendKeys("Ln12345678;");
		driver.findElement(By.cssSelector("#test-elf > button")).click();
		
		Thread.sleep(4000);
		driver.get("https://www.wish.com/");
		// to log in with blank password
		driver.findElement(By.cssSelector("#signup-form > div.test-elb.btn.main-color-background")).click();
		driver.findElement(By.cssSelector("#test-le")).sendKeys("leaguenational1@gmail.com");
		driver.findElement(By.cssSelector("#test-lp")).sendKeys("");
		driver.findElement(By.cssSelector("#test-elf > button")).click();
		
		Thread.sleep(4000);
		driver.get("https://www.wish.com/");
		// to log in with valid email with incorrect password
		driver.findElement(By.cssSelector("#signup-form > div.test-elb.btn.main-color-background")).click();
		driver.findElement(By.cssSelector("#test-le")).sendKeys("leaguenational1@gmail.com");
		driver.findElement(By.cssSelector("#test-lp")).sendKeys("abcd");
		driver.findElement(By.cssSelector("#test-elf > button")).click();
		
		Thread.sleep(4000);
		driver.get("https://www.wish.com/");
		// to log in with invalid email with incorrect password
		driver.findElement(By.cssSelector("#signup-form > div.test-elb.btn.main-color-background")).click();
		driver.findElement(By.cssSelector("#test-le")).sendKeys("leaguenational1");
		driver.findElement(By.cssSelector("#test-lp")).sendKeys("abcd");
		driver.findElement(By.cssSelector("#test-elf > button")).click();
		
		Thread.sleep(4000);
		driver.get("https://www.wish.com/");
		// to log in with correct information
		driver.findElement(By.cssSelector("#signup-form > div.test-elb.btn.main-color-background")).click();
		driver.findElement(By.cssSelector("#test-le")).sendKeys("leaguenational1@gmail.com");
		driver.findElement(By.cssSelector("#test-lp")).sendKeys("Ln12345678;");
		driver.findElement(By.cssSelector("#test-elf > button")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}