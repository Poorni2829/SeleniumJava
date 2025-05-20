package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumAss2 {

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
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.className("inputBox")).sendKeys("Technology");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shuruthi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Umashankar");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Welcome");
		
		driver.findElement(By.className("smallSubmit")).submit();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();

		
		
		
		
		
		
		
	}

}
