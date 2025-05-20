package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		Thread.sleep(3000);
		
		driver.findElement(By.id("Login")).submit();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath(@/div[contains(@class=\"slds-icon-waffle\")] )

		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.close();
		
		
	}

	private static int contains() {
		// TODO Auto-generated method stub
		return 0;
	}

}
