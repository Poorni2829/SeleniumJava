package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class WindowHandlingAssignment {

		    public static void main(String[] args) throws InterruptedException {

		        EdgeDriver driver = new EdgeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		        // Load the URL
		        driver.get("http://leaftaps.com/opentaps/control/login");

		        driver.get("http://leaftaps.com/opentaps/control/login");
	            driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	            driver.findElement(By.id("password")).sendKeys("crmsfa");
	            driver.findElement(By.className("decorativeSubmit")).click();
	            
	            // 3. Navigation
	            driver.findElement(By.linkText("CRM/SFA")).click();
	            driver.findElement(By.linkText("Contacts")).click();
	            driver.findElement(By.linkText("Merge Contacts")).click();
	            
	            // 4. Handle From Contact
	            String parentWindow = driver.getWindowHandle();
	            driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
	            
	            // Switch to new window
	            Thread.sleep(2000);
	            Set<String> windowHandles = driver.getWindowHandles();
	            List<String> windows = new ArrayList<>(windowHandles);
	            driver.switchTo().window(windows.get(1));
	            
	            // Select first contact
	            driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	            driver.switchTo().window(parentWindow);
	            
	            // 5. Handle To Contact
	            driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	            
	            // Switch to new window
	            Thread.sleep(2000);
	            windowHandles = driver.getWindowHandles();
	            windows = new ArrayList<>(windowHandles);
	            driver.switchTo().window(windows.get(1));
	            
	            // Select second contact
	            driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
	            driver.switchTo().window(parentWindow);
	            
	            // 6. Perform merge
	            driver.findElement(By.linkText("Merge")).click();
	            Thread.sleep(1000);
	            
	            // Handle alert
	            Alert alert = driver.switchTo().alert();
	            alert.accept();
	            
	            // 7. Verification
	            Thread.sleep(2000);
	            System.out.println("Final page title: " + driver.getTitle());
	            
	      
	            driver.close();
	        }
	    }


