package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumAss1 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.get("http://leaftaps.com/opentaps/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("democsr");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		Thread.sleep(2000);
		
		driver.findElement(By.className("decorativeSubmit")).submit();
		
		driver.findElement(By.id("label")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Accounts")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Poorni");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		
		driver.findElement(By.name("numberEmployees")).sendKeys("5");
		
		driver.findElement(By.className("smallSubmit")).submit();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
		
		
		

		
		
		
	}

}
