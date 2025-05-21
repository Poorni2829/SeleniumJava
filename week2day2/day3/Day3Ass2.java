package Week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3Ass2 {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).submit();
		
		driver.findElement(By.id("label")).click();
        
        driver.findElement(By.xpath("//a[text()='Create Account']")).click();
        
        driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Poorni");
        
        driver.findElement(By.xpath("//textarea[contains(@class,'inputBox')]")).sendKeys("Selenium Automation Tester");
        
        WebElement element = driver.findElement(By.name("industryEnumId"));
        
        Select sel = new Select(element);
        
        sel.selectByIndex(3);
        
        WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
        
        Select sel2 = new Select(element2);
        
        sel2.selectByVisibleText("S-Corporation");
        
        WebElement element3 = driver.findElement(By.name("dataSourceId"));
        
        Select sel3 = new Select(element3);
        
           sel3.selectByContainsVisibleText("Employee");
 
           WebElement element4 = driver.findElement(By.name("marketingCampaignId"));
           
           Select sel4 = new Select(element4);
           
           sel4.selectByIndex(6);      
           
          WebElement element5 = driver.findElement(By.name("generalStateProvinceGeoId"));
           
           Select sel5 = new Select(element5);
           
           sel5.selectByVisibleText("Texas");
           
           driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
           
           String title = driver.getTitle();
   		   System.out.println(title);
   		
   		   driver.close();
		
		
		
		
		
	}

}
