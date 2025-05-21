//facebook home assignment....

package Week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3Ass1 {

	public static void main(String[] args) {
	      EdgeDriver driver = new EdgeDriver();
	      
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.facebook.com/");
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	       
	        driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti')]")).click();

	        WebElement element = driver.findElement(By.name("firstname"));
	        
	        element.sendKeys("Poorni");
	        
	        WebElement element2 = driver.findElement(By.name("lastname"));
	        
	        element2.sendKeys("1234");
	        
	        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("0123456");
	        
	        WebElement element3 = driver.findElement(By.name("reg_passwd__"));
	        
	        element3.sendKeys("Poorni1234");
	        
	        WebElement element4 = driver.findElement(By.name("birthday_day"));
     
	        Select ss = new Select(element4);
	        
	        ss.selectByValue("23");
	        
	        WebElement element5 = driver.findElement(By.id("month"));
	        
	        Select ss2 = new Select (element5);
	        
	        ss2.selectByIndex(6);
	        
	        WebElement element6 = driver.findElement(By.name("birthday_year"));
	        
	        Select ss3 = new Select(element6);
	        
	        ss3.selectByIndex(2);
	        
	      //label[text()='Female']
	        
	        WebElement element7 = driver.findElement(By.xpath("//label[text()='Female']"));
	        
	        element7.click();
	        
	        
	    
	}

}







